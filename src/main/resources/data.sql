INSERT INTO recipe_category (id, uuid, category_name) VALUES
  (-1, '1eee06cc-7053-4d9a-ba1b-1e9cf33498da', 'Śniadanie'),
  (-2, '2eee06cc-7053-4d9a-ba1b-1e9cf33498db', 'Obiad'),
  (-3, '3eee06cc-7053-4d9a-ba1b-1e9cf33498dc', 'Kolacja');

INSERT INTO recipe (id, uuid, recipe_name, kcal, portions, recipe_category_id) VALUES
  (-1, '4eee06cc-7053-4d9a-ba1b-1e9cf33498da', 'Kanapki z awokado, papryką i kiełkami', 650, 1, -1),
  (-2, '5eee06cc-7053-4d9a-ba1b-1e9cf33498da', 'Soczewica ze szpinakiem, pieczarkami i komosą', 489, 1, -2);

INSERT INTO ingredient(id, uuid, recipe_id, ingredient_name, amount_hint, amount, amount_unit) VALUES
  (-1, '31ee06cc-7053-4d9a-ba1b-1e9cf33498da', -1, 'Dynia, pestki, łuskane', '1 garść', 15, 'g'),
  (-2, '41ee06cc-7053-4d9a-ba1b-1e9cf33498da', -1, 'Awokado', '1/2 sztuki', 70, 'g'),
  (-3, '51ee06cc-7053-4d9a-ba1b-1e9cf33498da', -1, 'Kiełki rzodkiewki', '1 i 3/4 łyżki', 15, 'g'),
  (-4, '61ee06cc-7053-4d9a-ba1b-1e9cf33498da', -1, 'Papryka czerwona', '1/2 sztuki', 115, 'g'),
  (-5, '71ee06cc-7053-4d9a-ba1b-1e9cf33498da', -1, 'Chleb żytni razowy', '2 kromki', 70, 'g'),
  (-6, '81ee06cc-7053-4d9a-ba1b-1e9cf33498da', -2, 'Soczewica czerwona, nasiona suche', '1/3 szklanki', 60, 'g'),
  (-7, '91ee06cc-7053-4d9a-ba1b-1e9cf33498da', -2, 'Czosnek', '1 ząbek', 5, 'g'),
  (-8, '91ee06cc-7053-4d9a-ba1b-1e9cf33498da', -2, 'Olej rzepakowy', '1 łyżka', 10, 'ml'),
  (-9, '92ee06cc-7053-4d9a-ba1b-1e9cf33498da', -2, 'Pieczarka uprawna, świeża', '5 sztuk', 100, 'g'),
  (-10, '93ee06cc-7053-4d9a-ba1b-1e9cf33498da', -2, 'Oregano, suszone', '2/3 łyżeczki', 2, 'g'),
  (-11, '94ee06cc-7053-4d9a-ba1b-1e9cf33498da', -2, 'Tymianek, suszony', '1/3 łyżeczki', 1, 'g'),
  (-12, '95ee06cc-7053-4d9a-ba1b-1e9cf33498da', -2, 'Szpinak', '3 garście', 75, 'g'),
  (-13, '96ee06cc-7053-4d9a-ba1b-1e9cf33498da', -2, 'Komosa ryżowa (Quinoa);ziarna', '1/3 woreczka', 40, 'g');

INSERT INTO recipe_step(id, uuid, recipe_id, step_number, step_description) VALUES
  (-1, '9eee06cc-7053-4d9a-ba1b-1e9cf33498da' ,-1, 1, 'Na pieczywo połóż plasterki awokado, papryki i kiełki rzodkiewki'),
  (-2, '9eee06cc-7053-4d9a-ba2b-1e9cf33498da' ,-1, 2, 'Posyp pestkami dyni'),
  (-3, '9eee06cc-7053-4d9a-ba3b-1e9cf33498da' ,-2, 1, 'Soczewicę i komosę ugotuj w wodzie do miękkości'),
  (-4, '9eee06cc-7053-4d9a-ba4b-1e9cf33498da' ,-2, 2, 'Na oleju zeszklij posiekaną cebulę z czosnkiem i przyprawami'),
  (-5, '9eee06cc-7053-4d9a-ba5b-1e9cf33498da' ,-2, 3, 'Dodaj pieczarki, dolej odrobinę wody i duś ok. 6-8 minut'),
  (-6, '9eee06cc-7053-4d9a-ba6b-1e9cf33498da' ,-2, 4, 'Dodaj szpinak i duś pod przykryciem ok. 2 minuty'),
  (-7, '9eee06cc-7053-4d9a-ba7b-1e9cf33498da' ,-2, 5, 'Na patelnię dorzuć soczewicę, komosę i dobrze wymieszaj');