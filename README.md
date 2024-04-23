# System Lotniczy - Projekt Java

Projekt ten implementuje prosty system lotniczy w języku Java, który odczytuje dane z pliku tekstowego i wykonuje różne operacje na tych danych.

## Wymagania

- Java 8 lub nowsza wersja
- Dowolne środowisko programistyczne kompatybilne z Javą

## Uruchomienie

1. Skompiluj pliki źródłowe za pomocą kompilatora Javy.
2. Uruchom program poprzez wykonanie pliku `Main.class`.

## Struktura projektu

- `Main.java`: Główna klasa programu, zawiera funkcję `main()` oraz różne metody realizujące zadania.
- `Pasazer.java`: Klasa reprezentująca pasażera, dziedziczy po klasie `Lot`.
- `Lot.java`: Klasa reprezentująca lot.
- `readData.java`: Klasa odpowiedzialna za odczyt danych z pliku tekstowego.

## Zadania

1. **Zadanie A**: Sortowanie pasażerów po nazwiskach, a w przypadku takich samych nazwisk po mieście.
2. **Zadanie B**: Wypisanie ilości pasażerów lecących do poszczególnych miast.
3. **Zadanie C**: Obliczenie łącznej kwoty wydanej na bilety lotnicze do poszczególnych miast.
4. **Zadanie D**: Zapisanie do pliku wszystkich lotów do Rzymu oraz adresów email z końcówką ".com".

## Plik wynikowy

Wyniki zadania D zostaną zapisane do pliku `wynik.txt`.

## Autor

Autor: [kamilz12]

## Licencja

Ten projekt jest udostępniony na licencji MIT
