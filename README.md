# Lab-Poo - Notiuni folosite in laboraotoare:

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

Laboratorul 5: Abstractizare
-----
Abstractizarea este unul dintre cele 4 principii POO de bază (Abstractizare, Încapsulare, Moștenire, Polimorfism). Abstractizarea nu permite ca anumite caracteristici să fie vizibile în exterior. Acest lucru se referă la construirea unei interfețe comune, a unui șablon general pe care se bazează o anumită categorie de obiecte, fără a descrie explicit caracteristicile fiecaruia. Obiectele cunosc interfața comună pe care o au dar nu și cum este ea interpretată de fiecare obiect in parte. Acest lucru este realizat prin utilizarea claselor abstracte și a interfețelor.
Metodele suprascrise în clasele derivate vor fi apelate folosind dynamic binding (late binding). Acesta este un mecanism prin care compilatorul, în momentul în care nu poate determina implementarea unei metode în avans, lasă la latitudinea JVM-ului (mașinii virtuale) alegerea implementării potrivite, în funcţie de tipul real al obiectului. Această legare a implementării de numele metodei la momentul execuţiei stă la baza polimorfismului. Nu există instanţe ale unei clase abstracte, aceasta exprimând doar un punct de pornire pentru definirea unor instrumente reale. De aceea, crearea unui obiect al unei clase abstracte este o eroare, compilatorul Java semnalând acest fapt.
 
 Laboratorul 6: Clase interne
 -----
 Clasele interne sunt de mai multe tipuri: clase interne normale (regular inner classes);mclase anonime (anonymous inner classes); clase interne statice (static nested classes);
 clase interne metodelor (method-local inner classes) sau blocurilor;

**Clase anonime :: În dezvoltarea software, există situații când o componentă a aplicației are o utilitate suficient de mare pentru a putea fi considerată o entitate separată (sau clasă). De multe ori, însă, aceasta nu este utilizată decât într-o porțiune restrânsă din aplicație, într-un context foarte specific (într-un lanț de moșteniri sau ierarhie de interfețe).

Putem folosi clase interne anonime în locul definirii unei clase cu număr de utilizări reduse. Acestea nu au nume și apar în program ca instanțe ale unei clase moștenite (sau a unei interfețe extinse), care suprascriu (sau implementează) anumite metode.
**Pentru clasele interne statice: Nu avem nevoie de un obiect al clasei externe pentru a crea un obiect al clasei interne. Nu putem accesa câmpuri nestatice ale clasei externe din clasă internă (nu avem o instanță a clasei externe).




