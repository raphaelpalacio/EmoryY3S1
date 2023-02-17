# Setting a working directory to get the proper data 
setwd("/Users/raphaelpalacio/Desktop/Emory/Y3S1/QTM100/Lab/LabHomework/LabHw1")

#allows R Studio to read the csv file 
present <- read.csv("present.csv", header = TRUE)

# Names of the columns (variable names)
names(present)
# Three variables: year, boys, and girls


# Dimensions of data set
dim(present)
# The dimensions of this data set is 63


# Years within the data set
present$year
# The years within this data set is from 1940 to 2002


# Proportion of boys and girls 
present$propBoys <- present$boys / (present$boys + present$girls)
present$propBoys

present$propGirls <- present$girls / (present$boys + present$girls)
present$propGirls

present$propBoys > present$propGirls
# This relationship prooves that the data holds the same trend as arbuthnot

# Plotting the boys over time
plot(x = present$year, y = present$propBoys, type = "l")
# Plotting the data of boys over time show a decline of which could allow us to 
# conclude that less baby boys are born or more are a victim of infant mortality


# Adding the title “Proportion of boys over time”
?plot # needed to fin out the command to add a title to a plot 
title(main = "Proportions of boys over time ", sub = NULL,
      xlab = NULL, ylab = NULL)


# How many years did the proportion of boys exceed 52?
sum(present$propBoys>0.512)
# 49 out of 62 years the proprotion of boys has exceeded 52


# Find the year with the largest number of births
max(present$boys+present$girls)
present$total<-present$boys+present$girls
present$total
# The year with the largest births in 1961
