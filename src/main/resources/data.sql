INSERT INTO recipe_category (id, category_name) VALUES
  (-1, 'Śniadanie'),
  (-2, 'Obiad'),
  (-3, 'Kolacja');

INSERT INTO recipe (id, recipe_name, kcal, portions, recipe_category_id) VALUES
  (-1, 'Kanapki z awokado, papryką i kiełkami', 650, 1, -1),
  (-2, 'Soczewica ze szpinakiem, pieczarkami i komosą', 489, 1, -2);

INSERT INTO ingredient(id, recipe_id, ingredient_name, amount_hint, amount, amount_unit) VALUES
  (-1, -1, 'Dynia, pestki, łuskane', '1 garść', 15, 'g'),
  (-2, -1, 'Awokado', '1/2 sztuki', 70, 'g'),
  (-3, -1, 'Kiełki rzodkiewki', '1 i 3/4 łyżki', 15, 'g'),
  (-4, -1, 'Papryka czerwona', '1/2 sztuki', 115, 'g'),
  (-5, -1, 'Chleb żytni razowy', '2 kromki', 70, 'g'),
  (-6, -2, 'Soczewica czerwona, nasiona suche', '1/3 szklanki', 60, 'g'),
  (-7, -2, 'Czosnek', '1 ząbek', 5, 'g'),
  (-8, -2, 'Olej rzepakowy', '1 łyżka', 10, 'ml'),
  (-9, -2, 'Pieczarka uprawna, świeża', '5 sztuk', 100, 'g'),
  (-10, -2, 'Oregano, suszone', '2/3 łyżeczki', 2, 'g'),
  (-11, -2, 'Tymianek, suszony', '1/3 łyżeczki', 1, 'g'),
  (-12, -2, 'Szpinak', '3 garście', 75, 'g'),
  (-13, -2, 'Komosa ryżowa (Quinoa);ziarna', '1/3 woreczka', 40, 'g');

INSERT INTO recipe_step(id, recipe_id, step_number, step_description) VALUES
  (-1, -1, 1, 'Na pieczywo połóż plasterki awokado, papryki i kiełki rzodkiewki'),
  (-2, -1, 2, 'Posyp pestkami dyni'),
  (-3, -2, 1, 'Soczewicę i komosę ugotuj w wodzie do miękkości'),
  (-4, -2, 2, 'Na oleju zeszklij posiekaną cebulę z czosnkiem i przyprawami'),
  (-5, -2, 3, 'Dodaj pieczarki, dolej odrobinę wody i duś ok. 6-8 minut'),
  (-6, -2, 4, 'Dodaj szpinak i duś pod przykryciem ok. 2 minuty'),
  (-7, -2, 5, 'Na patelnię dorzuć soczewicę, komosę i dobrze wymieszaj');
