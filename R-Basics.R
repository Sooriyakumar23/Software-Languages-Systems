print ("Hello World R !", quote = FALSE)

print ("Hello World R !")

3+5

3 - 5

3 *5

3/ 5

3 ^ 5

sqrt(3)

log(100)

log10(100)

a <- 5
a

b <- c(1, 2, 3, 4, 5)
b

c <- c("Alice", "Bob", "Charlie")
c

e <- 34:37
e

data()

data(trees)

head(trees)

nrow(trees)

dim(trees)

str(trees)

mean(trees$Girth)

attach(trees)

median(Girth)

sd(Girth)

min(Girth)

max(Girth)

fivenum(Girth)

summary(trees)

detach(trees)

describe(trees)

install.packages("psych")

require(psych)
library(psych)

?psych

data(iris)

str(iris)

head(iris)

tail(iris)

describeBy(iris, iris$Species)
