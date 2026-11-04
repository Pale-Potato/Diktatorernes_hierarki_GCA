# Diktatorernes hierarki

## Projektbeskrivelse

I dette projekt har vi udviklet et Diktator Management System i Java. Programmet håndterer forskellige typer diktatorer, som hver har deres egne egenskaber og handlinger.

Formålet med projektet er at arbejde med objektorienteret programmering (OOP), herunder abstrakte klasser, interfaces, arv, polymorfi og indkapsling.

## Diktatortyper

Vi har oprettet følgende diktatortyper:

* **Leader** – Abstrakt superklasse, som indeholder fælles attributter og metoder for alle ledere.
* **MilitaryDictator** – Repræsenterer en militærdiktator med en militær rang og militærrelaterede handlinger.
* **PoliticalDictator** – Repræsenterer en politisk diktator med et politisk parti og en partititel.
* **SocialMediaDictator** – Repræsenterer en diktator, der kontrollerer befolkningen gennem sociale medier, censur og propaganda.

## Funktionalitet

Programmet kan:

* Oprette forskellige diktatorer med individuelle egenskaber.
* Vise information om hver diktator, herunder navn, land og antal år ved magten.
* Udføre individuelle taler gennem `giveSpeech()`.
* Implementere politikker gennem `implementPolicy()`.
* Undertrykke opposition gennem `repressOpposition()`.
* Afholde parader gennem `holdParade()`.
* Udføre særlige handlinger afhængigt af diktatortypen.
* Udføre unikke handlinger for SocialMediaDictator, eksempelvis `censorContent()` og `createFakeNews()`.

## Programmets opbygning

### Abstrakt klasse – Leader

Vi har valgt at bruge en abstrakt klasse som fælles superklasse for vores diktatorer.

Leader indeholder de fælles attributter:

* `name`
* `country`
* `yearsInPower`

Derudover indeholder klassen fælles metoder som `printDetails()` og den abstrakte metode `giveSpeech()`.

Vi har valgt en abstrakt klasse, fordi alle diktatorer deler nogle grundlæggende egenskaber, men ikke nødvendigvis udfører deres handlinger på samme måde.

### Interface – PowerActions

Vi har oprettet interfacet `PowerActions`, som definerer følgende metoder:

* `implementPolicy()`
* `repressOpposition()`
* `holdParade()`

Både MilitaryDictator, PoliticalDictator og SocialMediaDictator implementerer interfacet.

Vi har valgt et interface, fordi det giver mulighed for at definere fælles funktionalitet uden at være afhængig af klassernes arv. Det gør også løsningen mere fleksibel, hvis vi senere vil tilføje andre klasser, der skal kunne udføre de samme handlinger.

### Arv og polymorfi

Vores diktatorklasser arver fra `Leader`, så vi kan genbruge fælles attributter og metoder frem for at gentage den samme kode i hver klasse.

Vi opretter vores diktatorer i en fælles `List<Leader>`, hvilket gør det muligt at behandle forskellige diktatortyper gennem samme datatype.

Ved hjælp af polymorfi kan vi kalde eksempelvis `giveSpeech()` på alle objekterne, selvom de har forskellige implementeringer af metoden.

Vi bruger desuden `instanceof` til at identificere specifikke diktatortyper og udføre deres særlige handlinger.

## Validering

Vi har implementeret validering af vores objekter for at sikre, at diktatorerne bliver oprettet med gyldige værdier.

Valideringen foregår primært gennem setters, hvor vi kontrollerer, om attributterne indeholder gyldige værdier.

Derudover har vi implementeret metoden `isValid()`, som kontrollerer, om et helt objekt er gyldigt.

Vi har også arbejdet med metoden `addLeader()`, som sørger for, at kun gyldige diktatorer bliver tilføjet til vores liste.

### Test af validering

Vi har testet valideringen ved bevidst at forsøge at oprette en diktator med ugyldige værdier, eksempelvis:

* Manglende navn.
* Manglende land.
* Negativt antal år ved magten.
* Manglende militær rang.

Under testen opdagede vi, at selvom vores setters registrerede fejlene, blev objekterne stadig oprettet og kunne tilføjes til listen.

Vi løste problemet ved at implementere `isValid()` og bruge `addLeader()` til at kontrollere objekterne, inden de bliver tilføjet til listen.

På den måde undgår vi, at ugyldige objekter bliver behandlet som almindelige diktatorer i programmet.

## Faglige refleksioner

Gennem projektet har vi arbejdet med flere centrale principper inden for objektorienteret programmering.

**Abstrakte klasser vs. interfaces**

Vi har lært forskellen mellem en abstrakt klasse og et interface. Vi bruger `Leader` til at samle fælles attributter og funktionalitet, mens `PowerActions` definerer handlinger, som diktatorerne skal kunne udføre.

Det giver en bedre opdeling af ansvar og gør det lettere at udvide programmet med nye diktatortyper.

**Polymorfi**

Ved at samle alle diktatorerne i en `List<Leader>` kan vi behandle forskellige objekter ensartet. Samtidig sørger polymorfi for, at de enkelte klassers egne implementeringer af metoderne bliver udført.

Vi har også brugt `instanceof` til at tilgå metoder, der kun findes i bestemte subklasser.

**Validering og objektets tilstand**

Under arbejdet med validering opdagede vi, at det ikke er nok blot at udskrive en fejlmeddelelse i en setter. Objektet kan stadig blive oprettet med ugyldige værdier.

Derfor har vi adskilt valideringen af de enkelte attributter fra valideringen af hele objektet gennem `isValid()`.

Ved at bruge `addLeader()` sikrer vi, at ugyldige objekter ikke bliver tilføjet til vores liste.

**Udvidelsesmuligheder**

En fordel ved vores struktur er, at vi kan tilføje nye diktatortyper uden at skulle ændre hele programmets opbygning.

Eksempelvis har vi udvidet det oprindelige hierarki med `SocialMediaDictator`, som både arver fra `Leader` og implementerer `PowerActions`, men samtidig har sine egne attributter og metoder.

Det demonstrerer, hvordan arv og interfaces kan bruges til at gøre et program mere fleksibelt og udvideligt.

## Konklusion

Projektet har givet os praktisk erfaring med objektorienteret programmering i Java.

Vi har arbejdet med at opbygge et klassehierarki, genbruge kode gennem arv, definere fælles funktionalitet gennem interfaces og anvende polymorfi til at behandle forskellige objekttyper.

Derudover har vi lært vigtigheden af validering, så vi sikrer, at programmet arbejder med gyldige objekter.

Samlet set har projektet givet os en bedre forståelse for, hvordan man strukturerer Java-programmer, så de bliver mere overskuelige, genanvendelige og nemmere at udvide.
