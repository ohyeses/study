# Ctrl + Shift + N 새로운 파일

math <- c(66, 64, 48, 46, 78, 60, 90, 50, 66, 70) #수학
phy <- c(70, 68, 46, 48, 84, 64, 92, 52, 68, 72) #물리
music <- c(80, 70, 88, 66, 76, 86, 84, 74, 60, 78) #음악

df1 <- data.frame(math, phy) # 데이터프레임 만들기
View(df1)
summary(df1)

# 1사분위 공식 - 50+(60-50) * 0.25 ->52.5
# 3사분위 공식 - 70+(70-66) * 0.75 ->69.0

install.packages("ggplot2") # 인스톨
library(ggplot2) #import
ggplot(data = df1, aes(x=math, y=phy))+geom_boxplot()

# 산점도 그래프 그리기
plot(formula = phy~math, data = df1)
out = lm(phy~math, data = df1)
abline(out, col = "red")
summary(out)

# 1.06863x-1.77887

df2 <- data.frame(math, music)

# df2 산점도 그래프 그리기
plot(formula = math~music, data = df2)
out = lm(math~music, data = df2)
abline(out, col = "Red")
summary(out)
sum(c(1,2,3))
cor.test(df1$phy, df1$math) # 수학과 물리는 양의 관계

cor.test(df2$math, df2$music) # 수학과 음악의 관계



