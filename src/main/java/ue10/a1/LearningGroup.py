class LearningGroup:
    def __init__(self, students=None):
        if students is None:
            self._students = []
        else:
            self._students = students

    def __str__(self):
        return str([str(student) for student in self._students])

    def __add__(self, other):
        new_group = LearningGroup()
        for student in self._students:
            new_group._students.append(student)
        new_group._students.append(other)
        return new_group

    # def __add__(self, other):
    #     self._students.append(other)

    @property
    def students(self):
        return self._students


class Student:
    def __init__(self, name, matNr):
        self.name = name
        self.matNr = matNr

    def __str__(self):
        return self.name + ' ' + str(self.matNr)

    def __add__(self, other):
        new_group = LearningGroup()
        new_group.students.append(self)
        new_group.students.append(other)
        return new_group

if __name__ == '__main__':
    student1 = Student('Alice Wonderland ', 42424242)
    student2 = Student('Bob Miller', 1564153)
    student3 = Student('Charly Robert', 4681398)
    group = student1 + student2
    print(group)
    group = group + student3
    group2 = student1 + student2 + student3
    print(group)
    print(group2)