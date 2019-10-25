def AsalKontrol(sayi):
    if sayi % 2 == 0:
        return False
    for deger in range(3,sayi,1):
        if sayi % deger == 0:
            return False

    return True
sayac=0
number=1
while sayac<10002:
    if AsalKontrol(number)==True:
        if sayac==10001:
            print(number)
            break
        sayac=sayac+1
    else:
         print(number,"asal değil")
    number=number+1
    print(sayac)


        

 
