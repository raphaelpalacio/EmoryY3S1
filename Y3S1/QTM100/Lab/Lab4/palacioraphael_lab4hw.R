setwd("/Users/raphaelpalacio/Desktop/Emory/Y3S1/QTM100/Lab/Lab4")


# Question 1 -> Pick any two categorical variables in the data set
# For this assignment I will select "sad" and "weapon"
yrbss2013<-read.csv("yrbss2013.csv", header=T)
sad <- yrbss2013$sad
table(sad)
prop.table(table(sad))
#for the categorical variable sad, 5984 reported no and 2498 reported yes
#no-70.55%, yes-29.45%

weapon<-yrbss2013$carried_weapon
table(weapon)
prop.table(table(weapon))
#for the categorical variable carried_weapon, 7162 reported no and 1320 reported yes
#no-84.44%, yes-15.56%

#Q2. For each variable in question 1, create 4 different for loops 

#a. Create a for loop that gets 100 samples of size 10 from the population. Report the average proportions.
sample_prop_sad100<- matrix(rep(NA,100), nrow=100, ncol=2)
for(i in 1:100){
  print(paste0('i=',i))
  samp1<-sample(sad,10)
  sample_prop_sad100[i,]<-prop.table(table(samp1))
}
colMeans(sample_prop_sad100)
#no-70.8% yes-33.6%

sample_prop_weapon100<- matrix(rep(NA,100), nrow=100, ncol=2)
for(i in 1:100){
  print(paste0('i=',i))
  samp2<-sample(weapon,10)
  sample_prop_weapon100[i,]<-prop.table(table(samp2))
}
colMeans(sample_prop_weapon100)
#no-86.5% yes-37.5%


#b. Create a for loop that gets 5,000 samples of size 10 from the population. Report the average proportions.
sample_prop_sad5000<- matrix(rep(NA,5000), nrow=5000, ncol=2)
for(i in 1:5000){
  print(paste0('i=',i))
  samp5<-sample(sad,10)
  sample_prop_sad5000[i,]<-prop.table(table(samp5))
}
colMeans(sample_prop_sad5000)
#no-70.12% yes-33.06%

sample_prop_weapon5000<- matrix(rep(NA,5000), nrow=5000, ncol=2)
for(i in 1:5000){
  print(paste0('i=',i))
  samp6<-sample(weapon,10)
  sample_prop_weapon5000[i,]<-prop.table(table(samp6))
}
colMeans(sample_prop_weapon5000)
#no-84.45% yes-33.37%

#c. Create a for loop that gets 200 samples of size 20 from the population. Report the average proportions
sample_prop_sad200 <- matrix(rep(NA,200), nrow=200, ncol=2)
for(i in 1:200){
  print(paste0('i= ', i))
  samp7<-sample(sad,20)
  sample_prop_sad200[i,]<-prop.table(table(samp7))
}
colMeans(sample_prop_sad200)
#no-70.05% yes-29.95%

sample_prop_weapon200 <- matrix(rep(NA,200), nrow=200, ncol=2)
for(i in 1:200){
  print(paste0('i= ', i))
  samp8<-sample(sad,20)
  sample_prop_weapon200[i,]<-prop.table(table(samp7))
}
colMeans(sample_prop_weapon200)
#no-70% yes-30%


#d. Create a for loop that gets 200 sample of size 5000 from the population Report the average proportions
sample_prop_sad200x <- matrix(rep(NA, 200), nrow=200, ncol=2)
for(i in 1:200){
  print(paste0('i=', i))
  samp9<-sample(sad, 5000)
  sample_prop_sad200x[i,]<-prop.table(table(samp9))
}
colMeans(sample_prop_sad200x)
#no=70.53% yes=29.47%

sample_prop_weapon200x <-matrix(rep(NA, 200), nrow=200, ncol=2)
for(i in 1:200){
  print(paste0('i=', i))
  samp10<-sample(sad, 5000)
  sample_prop_weapon200x[i,] <- prop.table(table(samp10))
}
colMeans(sample_prop_weapon200x)
#no=70.51% yes=29.48%

#d. What do you conclude about increasing the number of samples while keeping the size constant?
#the increasing in the number of samples does not show a significant change in result
#as the number of sample increases, the sample proportion gets closer to the population proportion
