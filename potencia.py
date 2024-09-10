def potencia(base, exponente):
    if((exponente % 2)!= 0):
        return potencia(base, (exponente-1)) * base
    if(exponente == 2):
        return (base * base)
    else:
        x = potencia(base, exponente//2)
        return(x*x)
    
print(potencia(2,6))