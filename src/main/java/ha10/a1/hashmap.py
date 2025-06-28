class Student:

    def __int__(self, name):
        self._name = name
        self._grades = {}

    def set_grade(self, course, grade):
        self._grades[course] = grade

    def get_average(self):
        return sum(self._grades.values()) / len(self._grades) if self._grades else 0.0