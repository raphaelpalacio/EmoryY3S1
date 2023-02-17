# getwd() gets you the working directory

# setting the work director
setwd("/Users/raphaelpalacio/Desktop/Emory/Y3S1/QTM100/Lab/labDataSets")

#allows R Studio to read the csv file 
arbuthnot <- read.csv("arbuthnot.csv", header = TRUE)


#Head of the data set
head(arbuthnot)

#Tail of the data set
tail(arbuthnot)

# Dimensions of data set
dim(arbuthnot)

# Names of the columns (variable names)
names(arbuthnot)

# Get a quick overview of the values in a data set 
summary(arbuthnot)
# Gets the min, 1st Qu, Median, Mean, 3rd Qu, and Max

# Access the data of a single column
arbuthnot$boys

# To get the total, we can add the vectors of variables, in this case boys
# girls combined
arbuthnot$boys + arbuthnot$girls

# Proportion using the columns/variables
arbuthnot$propBoys <- arbuthnot$boys / (arbuthnot$boys + arbuthnot$girls)
arbuthnot$propBoys


#Plotting the Data
plot(x = arbuthnot$year, y = arbuthnot$propBoys)

#Plot with Connecting the data with lines
plot(x = arbuthnot$year, y = arbuthnot$propBoys, type = "l")
