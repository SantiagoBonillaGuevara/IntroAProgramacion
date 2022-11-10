rios = {"rio Amazonas": ["Peru", "Colombia", "Brasil"], "rio Misisipi": "Estados unidos",
        "rio Nilo": ["Egipto", "Sudan"],
        "rio Yangtze": "China", "rio Ganges": "India"}
for i, j in rios.items():
    print(f" el ",i," atraviesa ",j)
print("----------------------------")
for i in rios:#imprimir rios
    print(i)
print("----------------------------")
for i in rios:#imprimir paises
    print(rios[i])
print("----------------------------")
glosario={"bucle":"Secuencia de ordenes que se ejecutan mientras un booleano sea true",
          "boolean":"Tipo de variable que solo puede tomar el valor de ´true´ o ´false´",
          "IDE":"Programa en el cual se puede escribir codigo en cierto lenguaje de programacion (algunos ide pueden leer varios lenguajes)",
          "Sintaxis":"Reglas gramaticales en un lenguaje de programación",
          "CIclo anidado":"Es un ciclo dentro de otro ciclo (necesario para recorrer arrays bidimensionales)"}
for i,j in glosario.items():
    print(i," :")
    print(j,"\n")
