import pandas as pd
company=['Tata','Mg','kIA','hyunda']
modal=['Nexon','Aster','saltos','creta']
year=[2017,2016,2015,2013]
data=list(zip(company,modal,year))
df=pd.Datafram(data,columns=['company','modal','year'])
print(df)