INSERT INTO recipe_category (id, category_name) VALUES
  (-1, 'Śniadanie'),
  (-2, 'Obiad'),
  (-3, 'Kolacja');

INSERT INTO recipe (id, recipe_name, kcal, portions, recipe_category_id) VALUES
  (-1, 'Kanapki z awokado, papryką i kiełkami', 650, 1, -1),
  (-2, 'Placki gryczane z pastą pomidorową', 528, 2, -2);

INSERT INTO ingredient(id, recipe_id, ingredient_name, amount_hint, amount, amount_unit) VALUES
  (-1, -1, 'Dynia, pestki, łuskane', '1 garść', 15, 'g'),
  (-2, -1, 'Awokado', '1/2 sztuki', 70, 'g'),
  (-3, -1, 'Kiełki rzodkiewki', '1 i 3/4 łyżki', 15, 'g'),
  (-4, -1, 'Papryka czerwona', '1/2 sztuki', 115, 'g'),
  (-5, -1, 'Chleb żytni razowy', '2 kromki', 70, 'g'),
  (-6, -2, 'Bazylia, świeża', '1 i 1/3 garści', 4, 'g'),
  (-7, -2, 'Oliwa z oliwek', '2/3 łyżki', 6, 'ml'),
  (-8, -2, 'Oregano, suszone', '1 i 1/3 łyżeczki', 6, 'g'),
  (-9, -2, 'Czarnuszka', '1 i 1/4 łyżeczki', 6, 'g'),
  (-10, -2, 'Suszone pomidory w oliwie', '6 plastrów', 120, 'g'),
  (-11, -2, 'Kasza gryczana niepalona', '1 szklanka', 200, 'g');

INSERT INTO recipe_step(id, recipe_id, step_number, step_description) VALUES
  (-1, -1, 1, 'Na pieczywo połóż plasterki awokado, papryki i kiełki rzodkiewki'),
  (-2, -1, 2, 'Posyp pestkami dyni'),
  (-3, -2, 1, 'Kaszę zalej na noc 2 szklankami wody'),
  (-4, -2, 2, 'Następnego dnia dodaj oliwę, zioła i zmiksuj na gładką masę'),
  (-5, -2, 3, 'Dodaj siemię, wymieszaj'),
  (-6, -2, 4, 'Wylewaj porcje masy na blachę wyłożoną papierem do pieczenia i piecz 15 minut w 180st'),
  (-7, -2, 5, 'Suszone pomidory z oliwy zmiksuj ze świeżą bazylią, solą, pieprzem i posmaruj pastą placki');
