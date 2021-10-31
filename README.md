# Lab-Poo

Laboratorul 2: Constructori și referințe

Obiectele se alocă pe heap.
Atribuirea de referințe nu creează o copie a obiectului, cum s-ar fi putut crede inițial.
Efectul este asemănător cu cel al atribuirii de pointeri în C.
Transferul parametrilor la apelul de funcții este foarte important de înțeles. Astfel:
*pentru tipurile primitive se transfera prin COPIERE pe stivă: orice modificare în funcția
apelată NU VA FI VIZIBILĂ în urma apelului.
*pentru tipurile definite de utilizator și instanțe de clase în general, se COPIAZĂ REFERINȚA pe stivă:
referința indică spre zona de memorie a obiectului, astfel că schimbările asupra câmpurilor vor fi vizibile
după apel, dar reinstanțieri (expresii de tipul: st = new Student()) în apelul funcției și modificările
făcute după ele, NU VOR FI VIZIBILE după apel, deoarece ele modifică o copie a referinței originale.
