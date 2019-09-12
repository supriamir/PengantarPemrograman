n = int(input("nilai n"))
y = int(input("nilai y"))

hasil = n % y == 0
hasil2 = y % n == 0
if (hasil):
    print("N adalah kelipatan y")
elif (hasil2):
    print("Y kelipatan N")
