# Zoo
pa practise

Készítsünk programot, amellyel szimulálni tudjuk a következő feladatot. Egy
állatkertben különböző állatokat tartanak, amelyeket etetniük kell. A gondozó három
fajta étel közül naponta csak egyet adhat az összes állatnak. Az ételek fajtái: hús,
zöldség, gyümölcs. Az állatok az egyes ételfajtákra eltérően reagálnak: nem eszik
meg, ekkor fogynak; elfogyasztják, de nem szeretik, ekkor a súlyuk nem változik;
szeretik, ekkor a súlyuk gyarapszik. Egy állat éhen pusztulhat, ha a súly nullára
csökken, illetve elhízásban is kimúlhat, ha túlsúlyossá válik. A túlsúlyosság határa
állatfajtánként eltérő.
A konkrét állatkertben négy fajta állatot tartanak: nyulat, farkast, sünt és medvét,
ezek jellemzői a következők:
• Nyúl: Hús esetén a súlya eggyel csökken, zöldség esetén kettővel nő, gyümölcs
  esetén eggyel nő. A túlsúlyosság határa 4.
• Farkas: Hús esetén a súlya hárommal nő, zöldség és gyümölcs esetén eggyel
  csökken. A túlsúlyosság határa 6.
• Sün: Hús esetén a súlya eggyel csökken, zöldség esetén nem változik,
  gyümölcs esetén kettővel nő. A túlsúlyosság határa 5.
• Medve: Hús és gyümölcs esetén a súlya eggyel nő, zöldség esetén eggyel
  csökken. A túlsúlyosság határa 10.
A szimuláció adatait egy szövegfájl tartalmazza a következő formátumban. Az első
sorban az etetés rendje szerepel, először a napok száma, majd az egyes napokon
adott étel fajtái: 1 – hús, 2 – zöldség, 3 – gyümölcs. Ezután soronként adottak az egyes
állatok adatai. A sor első eleme az állat fajtája, ezt követi az állat neve, végül az állat
kezdeti súlya szerepel a sorban.
A program kérje be a fájl nevét, majd írja ki az életben maradt állatok nevét. Ehhez
valósítsuk meg az állatokat reprezentáló osztályokat, amelyek egy absztrakt állat
osztály leszármazottai.
