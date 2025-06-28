import math
from abc import ABC, abstractmethod


class Shape(ABC):
    @abstractmethod
    def get_area(self):
        pass


class Circle(Shape):
    def __init__(self, radius):
        self._radius = radius

    def get_area(self):
        return math.pi * self._radius ** 2
