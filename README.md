<h1>Notification System Project</h1>

Acest proiect Java ilustrează utilizarea a două design patterns integrate coerent pentru a construi un sistem simplu de trimitere notificări: Factory Pattern și Strategy Pattern.

<h3>Design Patterns</h3>
<ol>
<li><h4>Factory Pattern</h4></li>

<b>Descriere:</b> Factory Pattern oferă o interfață pentru crearea de obiecte într-o superclasă, lăsând subclaselor decizia cu privire la tipul de obiect care va fi creat.

<b>Integrare în proiect:</b>
<ul>
<li>Clasa NotificationFactory definește metoda statică createSender(Type type, MessageFormatter formatter).</li>

<li>În funcție de valoarea enum-ului Type (EMAIL sau SMS), factory-ul instanțiază EmailSender sau SmsSender și injectează în constructor strategia de formatare (MessageFormatter).</li>

<li>Astfel, partea de creare a obiectelor NotificationSender este centralizată și ușor de extins dacă adăugăm noi tipuri de notificări.</li>
</ul>
<li><h4>Strategy Pattern</h4></li>

<b>Descriere:</b> Strategy Pattern permite modificarea dinamică a comportamentului unui algoritm, definind o familie de algoritmi, încadrați într-o interfață comună.

<b>Integrare în proiect:</b>
<ul>
<li>Interfața MessageFormatter declară metoda format(String message).</li>

<li>Două implementări concrete (PlainTextFormatter și HtmlFormatter) oferă strategii diferite de procesare a textului.</li>

<li>Clasele EmailSender și SmsSender primesc în constructor un MessageFormatter, pe care îl folosesc în metoda send(...) pentru a formata mesajul înainte de a-l trimite.</li>

<li>Astfel, formatul notificării poate fi schimbat simplu, fără modificarea codului sender-ului, doar prin furnizarea unei strategii diferite.</li>
</ul>
</ol>
