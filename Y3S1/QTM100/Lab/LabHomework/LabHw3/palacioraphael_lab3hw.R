# Set Working directory
setwd("/Users/raphaelpalacio/Desktop/Emory/Y3S1/QTM100/Lab/LabHomework/LabHw3")

# import the data set
fruitfly <- read.csv("fruitfly.csv")

# Q1(a). Produce an appropriate figure to compare the distribution of lifespan among the five experimental groups of fruitflies. What figure did you produce?
# produce side-by-side boxplots to compare the distribution of lifespan among the five experimental groups of fruitflies
# For this we use a box plot to plot the lifespan and the type of fruit fly 
boxplot(fruitfly$lifespan ~ fruitfly$type, xlab = "Type of Experimental Assignment", ylab = "Lifespan (days)")
# I saw that fly type 1 had a higher range of lifespan - including outlyers while fly type 5 had the loswest

# Q1(b). Identify the group with the shortest average lifespan and provide the mean and standard deviation of lifespan among this group.
# group 5 has the shortest average lifespan according to the side-by-side boxplots
tapply(X = fruitfly$lifespan, INDEX = fruitfly$type, FUN = sd) 
# the standard deviation of lifespan among group 5 is 12.10

tapply(X = fruitfly$lifespan, INDEX = fruitfly$type, FUN = mean) 
# the mean of lifespan among group 5 is 38.72

# Q2(a). Using the normal distribution, fill in the table below to calculate the probability of surviving within the given range of days.
# normal distribution for group 5 (8 virgin females)

# Days <= 30
pnorm(q = 30, mean = 38.7, sd = 12.1) 
# 0.24, 24% of fruitflies in group 5 are expected to survive less or equal to 30 days

# Days 30 - 50
pnorm(q = 50, mean = 38.7, sd = 12.1) - pnorm(q = 30, mean = 38.7, sd = 12.1) 
# 0.59, 59% of fruitflies in group 5 are expected to survive between 30 and 50 days

# Days 50 - 70
pnorm(q = 70, mean = 38.7, sd = 12.1) - pnorm(q = 50, mean = 38.7, sd = 12.1) 
# 0.17, 17% of fruitflies in group 5 are expected to survive between 50 and 70 days

# Days > 70
1 - pnorm(q = 70, mean = 38.7, sd = 12.1) 
# 0.00, 0% of fruitflies in group 5 are expected to survive more than 70 days

# Q2(b) Suppose five fruitflies escape from their experimental conditions in a different lab, but they were noted to survive 81 65 56 70 56 days. Do you think they came from the ‘supplied with 8 newly pregnant females’ group or the ‘supplied with with 8 virgin females’ group and why?
# normal distribution for group 3 (8 newly pregnant females)
pnorm(q = 81, mean = 63.4, sd = 14.5) - pnorm(q = 56, mean = 63.4, sd = 14.5) 
# 0.58, 58% of fruitflies in group 3 are expected to survive between 56 and 81 days

# normal distribution for group 5 (8 virgin females)
pnorm(q = 81, mean = 38.7, sd = 12.1) - pnorm(q = 56, mean = 38.7, sd = 12.1) 
# 0.08, 8% of fruitflies in group 5 are expected to survive between 56 and 81 days
# the five fruitflies came from the 'supplied with 8 newly pregnant females’ group because fruitflies in group 3 have a higher probability of surviving between 56 and 81 days
# 0% of fruitflies in the 'supplied with with 8 virgin females' group are expected to survive more than 70 days 

# Q3 Fill in the table to compare the theoretical quantiles (calculated using the normal distribution) and observed quantiles (calculated using fruitflysubset) from the two groups.
# create a new data set that only contains the group of fruitflies with the shortest average lifespan (group 5)
fruitflysubset<-subset(fruitfly,type==5)
# normal distribution for group 5, theoretical quantiles
# 10th percentile
qnorm(p = 0.10, mean = 38.7, sd = 12.1) # 23.2, 10% of fruitflies survive about 23 days or less
# 25th percentile
qnorm(p = 0.25, mean = 38.7, sd = 12.1) # 30.5, 25% of fruitflies survive about 31 days or less
# 50th percentile
qnorm(p = 0.50, mean = 38.7, sd = 12.1) # 38.7, 50% of fruitflies survive about 39 days or less
# 75th percentile
qnorm(p = 0.75, mean = 38.7, sd = 12.1) # 46.9, 75% of fruitflies survive about 47 days or less
# 90th percentile
qnorm(p = 0.90, mean = 38.7, sd = 12.1) # 54.2, 90% of fruitflies survive about 54 days or less

# fruitflysubset, observed quantiles
# 10th percentile
quantile(x = fruitflysubset$lifespan, probs = 0.10) # 21.8, the 10th percentile of the observed data is 21.8
# 25th percentile
quantile(x = fruitflysubset$lifespan, probs = 0.25) # 32, the 25th percentile of the observed data is 32
# 50th percentile
quantile(x = fruitflysubset$lifespan, probs = 0.50) # 40, the 50th percentile of the observed data is 40
# 75th percentile
quantile(x = fruitflysubset$lifespan, probs = 0.75) # 47, the 75th percentile of the observed data is 47
# 90th percentile
quantile(x = fruitflysubset$lifespan, probs = 0.90) # 54, the 90th percentile of the observed data is 54

