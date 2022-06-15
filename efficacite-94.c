#include <stdio.h>
#include <stdlib.h>
#include <string.h>

char *erase(char *chaine) {
  int i;
  int j = 0;
  // taille de la chaine de caractère
  int taille = strlen(chaine);

  //si la taille est égale à 0, renvoie chaine vide
  if (taille > 0) {
    char *NewPhrase = calloc(taille, sizeof(char));
    // premier caractère (si ce n'est pas un espace, ou qu'il y a un espace après, alors on recopie)
    if (chaine[0] != ' ' || chaine[1] == ' ') {
      NewPhrase[0] = chaine[0];
      j++;
    }

    // tous les caractères sauf premier et dernier (si ce n'est pas un espace, ou qu'il y a un espace avant ou après, alors on recopie)
    for (i = 1; i < taille - 1; i++) {
      if (chaine[i] != ' ' || chaine[i - 1] == ' ' || chaine[i + 1] == ' ') {
        NewPhrase[j] = chaine[i];
        j++;
      }
    }

    // dernier caractère (si ce n'est pas un espace, ou qu'il y a un espace avant, alors on recopie)
    if (chaine[i] != ' ' || chaine[i - 1] == ' ') {
      NewPhrase[j] = chaine[i];
      j++;
    }
    chaine = NewPhrase;
  }

  return chaine;
}
