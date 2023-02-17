# Set working directory 
setwd("/Users/raphaelpalacio/Desktop/Emory/Y3S1/QTM100/Lab/LabHomework/LabHw2")

adni <-read.table("ADNI.txt", header = TRUE)

#Question 1: How many observations?
#Import txt file ADNI.txt using "open an existing file"
#Result: 276 OBSERVATIONS


# Question 2
str(adni) 
#Result
#Description    DX     AGE   APOE4   GENDER   MMSE    adas   WholeBrain
#In reality   categ.   num    num     cat     num     num      num
#In R          chr     num    int     chr     int     num      int


#Question 3: Re-code APOE4 Variable
adni$APOE4f <-factor(adni$APOE4, labels = c("No copies", "One copy","Two coppies" ))
str(adni$APOE4f)
summary(adni$APOE4f)
#The least common genetic variant is the one with two copies with 30 observations.
#We recoded the APOE4 variable to factors that were then intervals represented 
#no, 1 or 2 copies.

# Question 4: Appropriate graph to visualize the distribution of AGE
hist(adni$AGE)
# It is easier to visualize the frequency 

# Question 5:
#a) To visualize the relationship between Alzheimer's diagnosis (DX) and the cognitive#impairment test MMSE use box plots. 
boxplot(adni$MMSE  ~ adni$DX)
# People with Alzheimer had a wider rangee in MMSE. people with normal brains got higher schores

#b)
boxplot(adni$adas  ~ adni$DX)
# People with normal scores - on average - lower on adas but those with alzheimers acheived higher scores

# Question 6:
#a) I will create a new object that divides each value of adni$WholeBrain by 100,000 and store it in a new variable called adni$WholeBrainf
WholeBrainF <- brain$WholeBrain / 100000
WholeBrainF <- adni$WholeBrain / 100000
WholeBrainF


#b) For numerical variables, We use the tapply() function to compare a numerical variable across groups of a categorical variable.
# AGE
tapply(X = adni$AGE, INDEX = adni$DX, FUN = mean)
#       AD      MCI   Normal 
# 73.91667 72.92266 74.28936 
tapply(X = adni$AGE, INDEX = adni$DX, FUN = sd)
#      AD      MCI   Normal 
# 8.006996 7.345171 5.770363

# For all 276
mean(adni$AGE)
sd(adni$AGE)
# 73.58261 6.994839

# For categorical variables, we can create a 2x2 table comparing the categorical variable across diagnosis groups.
# Then, we can create a proportion table that shows the proportion of observations for each group of the categorical variable and each diagnosis group.

# Gender
dx.gender.tab <- table(adni$GENDER, adni$DX)
dx.gender.tab 
#         AD MCI Normal
#Female 24  53     46
#Male   30  75     48

prop.table(dx.gender.tab)
#  This command creates a proportion table of the above data.
#                AD        MCI     Normal
#Female 0.08695652 0.19202899 0.16666667
#Male   0.10869565 0.27173913 0.17391304

# Brain Volume -> numerical variable so we take the mean and sd
tapply(X = WholeBrainF, INDEX = adni$DX, FUN = mean)
#       AD       MCI    Normal 
#       9.663467 10.321102 10.376936 

tapply(X = WholeBrainF, INDEX = adni$DX, FUN = sd)
#       AD       MCI    Normal 
#       1.2036533 1.1245627 0.9698503 

# APOE4
dx.APOE4F.tab <- table(adni$APOE4, adni$DX)
dx.APOE4F.tab
# AD MCI Normal
# 18  57     62
# 25  56     28
# 11  15      4
#  This command makes a new object that creates a table comparing number of APOE alleles to diagnosis group.
prop.table(dx.APOE4F.tab)
#  This command creates a proportion table that gives the proportion of the above meaning.
prop.table(dx.APOE4F.tab)
#AD        MCI     Normal
#0.06521739 0.20652174 0.22463768
# 0.09057971 0.20289855 0.10144928
# 0.03985507 0.05434783 0.01449275

mean(adni$AGE)

# Question 7
# The ADNI study has *276* participants. The average age is *73.6* years and *55.4*% are male.
# The Alzheimer's group has a *lower* average brain volume than the normal group (*9.66* vs *10.38* mm^3).
# Patients with Alzheimer's diagnosis have a *HIGHER* prevalence of two copies of the APOE4 allele compared to normal diagnosis patients (*3.99%* vs 4.3%*)



