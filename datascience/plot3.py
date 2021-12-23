import numpy as np
import matplotlib.pyplot as plt
marks=np.array([60,80,40,78,61])
mylabels=['english','maths','computer','java','python']
me=[0.2,0.1,0.1,0.1,0.1]
mclr=["black","hotpink","orange","green","red"]
plt.pie(marks,labels=mylabels,explode=me,shadow=True,colors=mclr,autopct='%1.2f%%')
plt.title("Pie chart of result")
plt.legend(title="subjects:")
print(plt.show())
