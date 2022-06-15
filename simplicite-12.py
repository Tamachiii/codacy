def erase (chaine) :
    liste = list(chaine)
    res = ""
    if len(liste)<1:
        return ""
    elif len(liste)==1:
        if liste[0]==" ":
            return ""
        else :
            res += tab[0]
            return res
    if ((liste[0]==" ") and (liste[1]==" ")):
        res+=" "
    elif (liste[0]!= " "):
        res+=liste[0]
    else :
        res+=""
    i=0
    for i in range (1, len(liste)-1):
        if ((liste[i]==" ") and ((liste[i+1]==" ")or(liste[i-1])==" ")):
            res+=" "
        elif (liste[i]!= " "):
            res+=liste[i]
        else :
            res+=""
    i+=1
    if ((liste[i]==" ") and (liste[i-1]==" ")):
        res+=" "
    elif (liste[i]!= " "):
        res+=liste[i]
    else :
        res+=""
    return res

print(erase("test _"))
