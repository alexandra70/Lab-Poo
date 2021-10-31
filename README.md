# Lab-Poo

Laboratorul 1: Intro
-----

Laboratorul 2: Constructori și referințe
-----
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

Laboratorul 3: Agregare și moștenire
-----
Agregarea (aggregation) - obiectul-container poate exista și în absența obiectelor agregate, de aceea este considerată o asociere slabă (weak association).
Compunerea (composition) - este o agregare puternică (strong), indicând că existența unui obiect este dependentă de un alt obiect.
Moștenire (Inheritance)
Numită și derivare, moștenirea este un mecanism de refolosire a codului specific limbajelor orientate obiect și reprezintă posibilitatea de a defini o clasă care extinde o altă clasă deja existentă. Ideea de bază este de a prelua funcționalitatea existentă într-o clasă și de a adăuga una nouă sau de a o modela pe cea existentă.
Relații între obiecte:

Agregare - has a | Moștenire - is a | Upcasting - convertire copil ⇒ părinte - realizată automat. | Downcasting - convertire părinte ⇒copil - trebuie făcută explicit de către programator.

Laboratorul 4: static și final; Singleton pattern
-----
Variabilele declarate cu atributul final pot fi inițializate o **singură dată**.
**Singleton Pattern** - (Lazy instantiation (este accesata memoria doar în momentul în care acest lucru este necesar))
Pattern-ul Singleton este utilizat pentru a restricționa numărul de instanțieri ale unei clase la un singur obiect. Astfel, acest design pattern asigură crearea unei singure instanțe a clasei, oferind un punct de acces global al acesteia.
Instanțierea eager, instanța clasei este creată la momentul CLASS LOADING.




