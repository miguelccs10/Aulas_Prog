tempoTotal = int(input("Digite quantos segundos leva o processo: "))
horas = tempoTotal // 3600
minutos = (tempoTotal - 3600 * horas) // 60
segundos = tempoTotal - 3600 * horas - 60 * minutos

print(f"{horas} horas, {minutos} min, {segundos} segs")