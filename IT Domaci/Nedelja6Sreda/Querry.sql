SELECT * from profesori
WHERE godine > 45;

SELECT ime,prezime FROM ucenici
WHERE godine > 15 AND prosek > 6.5

SELECT godine FROM ucenici
ORDER BY godine DESC;

SELECT * FROM profesori
WHERE predmet = 'Informatika';

SELECT ucenikid, ime, prezime FROM ucenici
WHERE LENGTH(ime) = 6;
