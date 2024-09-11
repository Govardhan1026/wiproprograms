class Animal
    def makeSound(self)
        print ("Generic animal sound")

class Cat(Animal)
    def makeSound(self):
        print("Meow")

Create a Cat object
my_cat = Cat()

Call the makeSound method on the Cat object
my_cat.makeSound()