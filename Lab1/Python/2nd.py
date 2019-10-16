class Student:
    def __init__(self, name=None, age=None, mark=None):
        self.name = name
        self.age = age
        self.mark = mark

    def print_student(self):
        return 'student {}, {} years old, mark {}'.format(self.name, self.age, self.mark)


class University:
    def __init__(self, name=None, foundation_year=None, students=None):
        self.name = name
        self.foundation_year = foundation_year
        self.students = students

    def print_uni(self):
        msg = " "
        for i in self.students:
            msg += "\n"
            msg += i.print_student()

        print("{} University, founded {}, students are {}:".format(self.name, self.foundation_year, msg))

    def average(self):
        result = 0
        for i in self.students:
            result += i.mark
        return result / len(self.students)


student1 = Student("Grigore", 19, 5)
student2 = Student("Nikita", 20, 7)
student3 = Student("Petru", 21, 9)

student4 = Student("Vasile", 22, 8)
student5 = Student("Vlad", 21, 6)
student6 = Student("Lucretiu", 20, 5)

student7 = Student("Valentina", 19, 9)
student8 = Student("Jenia", 18, 7)
student9 = Student("Viorica", 17, 5)

studentsUTM = [student1, student2, student3]
studentsUSM = [student4, student5, student6]
studentsASE = [student7, student8, student9]

utm = University("UTM", 1990, studentsUTM)
usm = University("USM", 1970, studentsUSM)
ase = University("ASE", 1770, studentsASE)

# print(student1.print_student())
# print('\n')

print(utm.print_uni())
print('\n')
print(usm.print_uni())
print('\n')
print(ase.print_uni())
print('\n')

print('average')
print(utm.average())
print(usm.average())
print(ase.average())
