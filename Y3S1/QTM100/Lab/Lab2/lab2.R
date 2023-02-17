getwd()
setwd("/Users/raphaelpalacio/Desktop/Emory/Y3S1/QTM100/Lab/Lab2")

babies <-read.table("babies.txt", header = TRUE)

#Variable Types
# Reveal all fo the variables in the data set of type string (str)
str(babies)

# Summary of the data set
summary(babies)

# Variables parity and smoke do not represent numeric measurements
# Convert them to categorical variables
# 0 -> not that condition; 1 -> that condition
babies$parityf <-factor(babies$parity, labels = c("first born", "otherwise"))
babies$smokef <-factor(babies$smoke, labels = c("not now", "yes now"))

# Run again with the new variables
str(babies$parityf)
summary(babies$parityf)

# Numerical Variables
# Summary command to give overall numerical summary of the data set
summary(babies$bwt) # Summary of birth weight

# Get the mean of birth weight (bwt)
mean(babies$bwt)

#Get the SD of numerical variable
sd(babies$bwt)
# You can also get the min, max, median, range, and IQR with their proper functions

# We can compare numerical and categorical variables

# Summarize bwet separatrly from smking and non - smoking mothers
tapply(X = babies$bwt, INDEX = babies$smokef, FUN = sd) 
# This gives us the sd of the babies weight based on if the mother smokes or not

tapply(X = babies$bwt, INDEX = babies$smokef, FUN = mean)
# Same thing as above but gives us the mean

# Visualizing numerical variables
hist(babies$bwt)
boxplot(babies$bwt)

# Side by Side box plots
boxplot(babies$bwt ~ babies$smokef)

# You can also use the scatterplot 
plot(babies$gestation, babies$bwt)


# Categorical Variables
table(babies$smokef)

# See the sum of obsercation(margins)
smk.tab <- table(babies$smokef)
smk.tab
addmargins(smk.tab)

# Table between two categorical variables to show a relationship
table(babies$smokef, babies$parityf)

# Get margins and proportion s from a 2x2 table
smk.par.tab <- table(babies$smokef, babies$parityf)
addmargins(smk.par.tab)
prop.table(smk.par.tab) # This is a proportion table of each of the groups with margins

# Visualizing Categorical Variables
# Get a bar plot
barplot(smk.tab)

#Whenever we use counts, we always use side by side bar plots
barplot(smk.par.tab, bestide = T, legent.text = T)

# bar plot with proportions
barplot(prop.table(smk.par.tab, margin = 2), beside = F, legend.text = T)
