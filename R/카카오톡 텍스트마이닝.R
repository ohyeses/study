# KoNLP 패키지 설치
install.package("KoNLP")
library(KoNLP)

install.packages("rJava")
install.packages("memoise")
install.packages("multilinguer")
install.packages(c('stringr', 'hash', 'tau','Sejong', 'RSQLite', 'devtools'))
install.packages("remotes")
libraryj(remotes)
remotes::install_github('haven-jeon/KoNLP', upgrade = "never", INSTALL_opts=c("--no-multiarch"))
library(KoNLP)

extractNoun("안녕하세요 여러분 텍스트마이닝 실습시간입니다") #명사만 뽑아서 
extractNoun("하이퍼링크로 사용할 텍스트나 개체를 선택합니다.")

list.files() #나의 디렉토리 파일 목록보기
setwd("C:/Users/smhrd/Rstudy") #
list.files()

useNIADic()

mergeUserDic(data.frame(c(("박병관")), c("ncn")))
mergeUserDic(data.frame(c(("오픽")), c("노잼")))
mergeUserDic(data.frame(c(("4차산업혁명")), c("ncn")))
mergeUserDic(data.frame(c(("박병관")), c("ncn")))

text1 <- readLines("kakao.txt") # 텍스트를 벡터형태로 저장

text2 <- extractNoun(text1) #명사 추출

text
text3 <- unlist(text2) # 벡터형식으로 변환
text4 <- gsub("ㅋ", "", text3) # 의미없는 불용어(단어) 제거거
text5 <- gsub("ㅎ", "", text4)

text6 <- text5[nchar(text5) < 6] #6보다 작은 것만 txt에 넣기, 글자 길이를 판단하여 저장 
text7 <- text6[nchar(text6) > 1] #한 글자보다 큰거

text8 <- sort(table(text7), decreasing = T)# 내림차순 정렬, F면 오름차순
text9 <- head(text8, 50)

install.packages("wordcloud2")
library(wordcloud2)

wordcloud2(text9)

###################
text1 <- readLines("kakao2.txt") # 텍스트를 벡터형태로 저장

text2 <- extractNoun(text1) #명사 추출

text
text3 <- unlist(text2) # 벡터형식으로 변환
text4 <- gsub("ㅋ", "", text3) # 의미없는 불용어(단어) 제거거
text5 <- gsub("ㅎ", "", text4)

text6 <- text5[nchar(text5) < 6] #6보다 작은 것만 txt에 넣기, 글자 길이를 판단하여 저장 
text7 <- text6[nchar(text6) > 1] #한 글자보다 큰거

text8 <- sort(table(text7), decreasing = T)# 내림차순 정렬, F면 오름차순
text9 <- head(text8, 50)

install.packages("wordcloud2")
library(wordcloud2)

wordcloud2(text9)
