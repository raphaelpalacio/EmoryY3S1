setwd("/Users/raphaelpalacio/Desktop/Emory/Y3S1/QTM100/Lab/Lab4")
yrbss <- read.csv("yrbss2013.csv", header = T)

# Variable created for bullying
bullied<- factor(yrbss$bullied)

# Distribution of students bullied on school property
table(bullied)
prop.table(table(bullied))

# Collecting a simple random sample of size 10 from bullies
samp1 <- sample(x = bullied, size = 10)
prop.table(table(samp1))

# Random sample of size 10
samp2 <- sample(x = bullied, size = 200)
prop.table(table(samp2))

sample_prop10 <- matrix(rep(NA, 500), nrow= 500, ncol = 2)
for(i in 1:500){
  samp <- sample(bullied, 10)
  sample_prop10[i,] <- prop.table(table(samp))
}
barplot(colMeans(sample_prop10), names.arg = c('no', 'yes'), ylim = c(0,1))
prop.table(sample_prop10)
