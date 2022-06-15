# return string without spaces
def erase(cc):
  chaine = ""
  for i in range(len(str)):
    if i == len(str) - 1 and str[i] == " ":
      if str[i] == " ":
        chaine += ""
      else:
        chaine += str[-1]
      break
    if str[i] != " ":
      chaine += str[i]
    elif (str[i] == " " and str[i + 1]) == " " or (str[i] == " " and str[i - 1] == " "):
      chaine += str[i]
    else:
      chaine += ""
    return

print(erase("test  "))
