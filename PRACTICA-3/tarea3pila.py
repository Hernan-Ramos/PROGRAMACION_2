class Pila:
    def __init__(self,n):
        self.__arreglo = [0] * n
        self.__top = -1
        self.__n = n
    def push(self, e):
        if self.__top == self.__n - 1:
            print("la pila esta llena")
        else :
            self.__top = self.__top + 1
            self.__arreglo[self.__top] = e

    def pop(self):
        if self.isEmpty():
            print("La pila esta vacia")
            return None
        else :
            elemento = self.__arreglo[self.__top]
            self.__top = self.__top - 1
            return elemento
    
    def peek(self):
        if self.isEmpty():
            print("pila vacia")
            return None
        else :
            return self.__arreglo[self.__top]
    
    def isEmpty(self):
        if self.__top == - 1:
            return True
        else :
            return False
    
    def isFull(self):
        if self.__top == self.__n - 1:
            return True
        else :
            return False

die = Pila(5)
die.push(10)
die.push(20)
die.push(30)
print(die.peek())
print("pop",die.pop())
print(die.peek())
die.push(40)
print(die.isFull())











        
        
        
        
        

