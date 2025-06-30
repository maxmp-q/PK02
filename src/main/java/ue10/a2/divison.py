def division(numberator, denominator):
    if denominator == 0:
        raise ZeroDivisionError("Dividing by Zero")
    if not isinstance(numberator, int) or not isinstance(denominator, int):
        raise ValueError("Values should be numbers")
    return numberator / denominator

def test():
    i = input("Gib")
    print(i)

# TODO: Verbesser das!

print(division(1, 7))

test()