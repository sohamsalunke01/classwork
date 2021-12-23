import pandas as pd
file=pd.read_csv("/home/student/s_tybcs/datascience/data.csv")
print("\nDATA VALUES")
print("---------------")
print(file)
dframe=pd.DataFrame(file)
print("\n FREQUENCY DISTRIBUTION")
print("-------------------------")
data=dframe.groupby(['Gender','Result']).size().unstack().reset_index()
data['Total']=(data['P']+data['F'])
data['Pass_Percent']=data['P']/data['Total']
data['Fail_Percent']=data['F']/data['Total']
print(data[:])
