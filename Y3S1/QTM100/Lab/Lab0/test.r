#2+2
#1:20 # If you do x : y, it will print out a list of numbers, inclusive, from x to y

#c is to combine

# Store the list of numbers into "x"
#x<-c(2,3,5,7)
#x = c(2,3,5,7)
#y = c(1,4,6,9)

#plot(x,y, type="l") # The last part is to tell it what type of plot you want 


# Summary statistics for respondent height
# (Assumes you have imported the dataset - see instructions on importing a dataset) 
#summary(yrbss2013$height_m)

#basic plot
plot(x = yrbss2013$height_m,y = yrbss2013$weight_kg)

#custom plot - add labels
#plot(x = yrbss2013$height_m,
     #y = yrbss2013$weight_kg,
    # type = "p",
    # xlab = "Height (m)",
    # ylab = "Weight (kg)")
