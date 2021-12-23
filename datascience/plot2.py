import numpy as np
import matplotlib.lines
import matplotlib.pyplot as plt
x=np.linspace(7,50,100)
y=x*np.linspace(100,150,100)
plt.plot(x,y,c='m',marker='^',markersize=4)
plt.grid(True)
plt.legend("")
print(plt.show())