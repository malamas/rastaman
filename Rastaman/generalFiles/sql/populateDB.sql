-- genres
INSERT INTO Genre VALUES (1, 'Rock');
INSERT INTO Genre VALUES (2, 'Pop');
INSERT INTO Genre VALUES (3, 'Folk');
INSERT INTO Genre VALUES (4, 'World');
INSERT INTO Genre VALUES (5, 'R&B');
INSERT INTO Genre VALUES (6, 'Tango');
INSERT INTO Genre VALUES (7, 'Latin');
INSERT INTO Genre VALUES (8, 'Classical');
INSERT INTO Genre VALUES (9, 'Reggae');
INSERT INTO Genre VALUES (10, 'Blues');
INSERT INTO Genre VALUES (11, 'Hip hop');
ALTER TABLE Genre ALTER COLUMN id RESTART WITH 12;

-- labels
INSERT INTO Label VALUES (1, 'Harvest', NULL, NULL);
INSERT INTO Label VALUES (2, 'Swan Song', NULL, NULL);
INSERT INTO Label VALUES (3, 'Atlantic', NULL, NULL);
INSERT INTO Label VALUES (4, 'Sony Music', '550 Madison Ave., New York, NY 10022, USA', NULL);
INSERT INTO Label VALUES (5, 'Universal Music', '2220 Colorado Avenue, Santa Monica, CA 90404, USA', NULL);
INSERT INTO Label VALUES (6, 'Warner Music', '75 Rockefeller Plaza, New York, NY 10019, USA', NULL);
INSERT INTO Label VALUES (7, 'Island Records', NULL, NULL);
INSERT INTO Label VALUES (8, 'EMI Records', NULL, NULL);
ALTER TABLE Label ALTER COLUMN id RESTART WITH 9;

-- groups
INSERT INTO Music_group VALUES (1, 'Pink Floyd', '1965-01-01');
INSERT INTO Music_group VALUES (2, 'Led Zeppelin', '1968-01-01');
ALTER TABLE Music_group ALTER COLUMN id RESTART WITH 3;

-- artists
INSERT INTO Artist VALUES (1, 'Waters', 'Roger', NULL, 'm', '1943-09-06', 'Great Bookham, Surrey, England, UK', 1);
INSERT INTO Artist VALUES (2, 'Gilmour', 'David', NULL, 'm', '1946-03-06', 'Cambridge, England, UK', 1);
INSERT INTO Artist VALUES (3, 'Mason', 'Nick', NULL, 'm', '1944-01-27', 'Edgbaston, Birmingham, England, UK', 1);
INSERT INTO Artist VALUES (4, 'Wright', 'Richard', NULL, 'm', '1943-07-28', 'Hatch End, Middlesex, England, UK', 1);
INSERT INTO Artist VALUES (5, 'Barrett', 'Syd', NULL, 'm', '1946-01-06', 'Cambridge, England, UK', 1);
INSERT INTO Artist VALUES (6, 'Page', 'Jimmy', NULL, 'm', '1944-01-09', 'Heston, Middlesex, England, UK', 1);
INSERT INTO Artist VALUES (7, 'Plant', 'Robert', NULL, 'm', '1948-08-20', 'West Bromwich, Staffordshire, England, UK', 1);
INSERT INTO Artist VALUES (8, 'Bonham', 'John', NULL, 'm', '1948-05-31', 'Redditch, Worcestershire, England, UK', 1);
INSERT INTO Artist VALUES (9, 'Jones', 'John Paul', NULL, 'm', '1946-01-03', 'Sidcup, Kent, England, UK', 1);
INSERT INTO Artist VALUES (10, 'Χατζηδάκις', 'Μάνος', NULL, 'm', '1925-10-23', 'Ξάνθη, Ελλάδα', 4);
INSERT INTO Artist VALUES (11, NULL, NULL, 'Eminem', 'm', '1972-10-17', 'Detroit, Michigan, USA', 11);
INSERT INTO Artist VALUES (12, 'Marley', 'Robert Nesta', 'Bob Marley', 'm', '1945-02-06', 'Nine Mile, Saint Ann, Jamaica', 9);
INSERT INTO Artist VALUES (13, 'Pugliese', 'Osvaldo', NULL, 'm', '1905-12-02', 'Villa Crespo, Buenos Aires, Argentina', 6);
ALTER TABLE Artist ALTER COLUMN id RESTART WITH 14;

-- group artists
-- Pink Floyd members
INSERT INTO Artist_Music_group VALUES (1, 1);
INSERT INTO Artist_Music_group VALUES (2, 1);
INSERT INTO Artist_Music_group VALUES (3, 1);
INSERT INTO Artist_Music_group VALUES (4, 1);
INSERT INTO Artist_Music_group VALUES (5, 1);

-- Led Zeppelin members
INSERT INTO Artist_Music_group VALUES (6, 2);
INSERT INTO Artist_Music_group VALUES (7, 2);
INSERT INTO Artist_Music_group VALUES (8, 2);
INSERT INTO Artist_Music_group VALUES (9, 2);
--

-- albums
INSERT INTO Album VALUES (1, 'The Dark Side Of The Moon', 1, '1973-03-01', 'lp', 1, NULL, 1);
INSERT INTO Album VALUES (2, 'Celebration Day', 2, '2012-11-16', 'lp', 1, NULL, 2);
INSERT INTO Album VALUES (3, 'Celebration Day', 2, '2012-11-16', 'lp', 2, NULL, 2);
INSERT INTO Album VALUES (4, 'Reflections', 3, '1970-01-01', 'lp', 1, 10, NULL);
INSERT INTO Album VALUES (5, 'Rastaman Vibration', 7, '1976-04-30', 'lp', 1, 12, NULL);
INSERT INTO Album VALUES (6, 'Reliquias - Instrumentales inolvidables Vol. 3', 8, '1999-01-01', 'lp', 1, 13, NULL);
ALTER TABLE Album ALTER COLUMN id RESTART WITH 7;

-- songs
INSERT INTO Song VALUES (1, 'Speak To Me', 90, 1, 1);
INSERT INTO Song VALUES (2, 'Breathe', 163, 2, 1);
INSERT INTO Song VALUES (3, 'On The Run', 210, 3, 1);
INSERT INTO Song VALUES (4, 'Time', 413, 4, 1);
INSERT INTO Song VALUES (5, 'The Great Gig In The Sky', 255, 5, 1);
INSERT INTO Song VALUES (6, 'Money', 390, 6, 1);
INSERT INTO Song VALUES (7, 'Us And Them', 454, 7, 1);
INSERT INTO Song VALUES (8, 'Any Colour You Like', 204, 8, 1);
INSERT INTO Song VALUES (9, 'Brain Damage', 230, 9, 1);
INSERT INTO Song VALUES (10, 'Eclipse', 105, 10, 1);
INSERT INTO Song VALUES (11, 'Good Times Bad Times', 190, 1, 2);
INSERT INTO Song VALUES (12, 'Ramble On', 337, 2, 2);
INSERT INTO Song VALUES (13, 'Black Dog', 318, 3, 2);
INSERT INTO Song VALUES (14, 'In My Time Of Dying', 661, 4, 2);
INSERT INTO Song VALUES (15, 'For Your Life', 368, 5, 2);
INSERT INTO Song VALUES (16, 'Trampled Under Foot', 362, 6, 2);
INSERT INTO Song VALUES (17, 'Nobody''s Fault But Mine', 384, 7, 2);
INSERT INTO Song VALUES (18, 'No Quarter', 540, 8, 2);
INSERT INTO Song VALUES (19, 'Since I''ve Been Loving You', 455, 1, 3);
INSERT INTO Song VALUES (20, 'Dazed And Confused', 679, 2, 3);
INSERT INTO Song VALUES (21, 'Stairway To Heaven', 508, 3, 3);
INSERT INTO Song VALUES (22, 'The Song Remains The Same', 335, 4, 3);
INSERT INTO Song VALUES (23, 'Misty Mountain Hop', 288, 5, 3);
INSERT INTO Song VALUES (24, 'Kashmir', 528, 6, 3);
INSERT INTO Song VALUES (25, 'Whole Lotta Love', 409, 7, 3);
INSERT INTO Song VALUES (26, 'Rock And Roll', 259, 8, 3);
INSERT INTO Song VALUES (27, 'Orpheus', 151, 1, 4);
INSERT INTO Song VALUES (28, 'The Day', 220, 2, 4);
INSERT INTO Song VALUES (29, 'Love Her', 257, 3, 4);
INSERT INTO Song VALUES (30, 'Dance Of The Dogs', 178, 4, 4);
INSERT INTO Song VALUES (31, 'Kemal', 241, 5, 4);
INSERT INTO Song VALUES (32, 'Dedication', 167, 6, 4);
INSERT INTO Song VALUES (33, 'The Three Answers', 228, 7, 4);
INSERT INTO Song VALUES (34, 'Street Song', 206, 8, 4);
INSERT INTO Song VALUES (35, 'Bitter Way', 255, 9, 4);
INSERT INTO Song VALUES (36, 'Noble Dame', 191, 10, 4);
INSERT INTO Song VALUES (37, 'Positive Vibration', 214, 1, 5);
INSERT INTO Song VALUES (38, 'Roots, Rock, Reggae', 218, 2, 5);
INSERT INTO Song VALUES (39, 'Johnny Was', 228, 3, 5);
INSERT INTO Song VALUES (40, 'Cry to Me', 156, 4, 5);
INSERT INTO Song VALUES (41, 'Want More', 254, 5, 5);
INSERT INTO Song VALUES (42, 'Crazy Baldhead', 192, 6, 5);
INSERT INTO Song VALUES (43, 'Who the Cap Fit', 283, 7, 5);
INSERT INTO Song VALUES (44, 'Night Shift', 190, 8, 5);
INSERT INTO Song VALUES (45, 'War', 216, 9, 5);
INSERT INTO Song VALUES (46, 'Rat Race', 170, 10, 5);
INSERT INTO Song VALUES (47, 'Gallo ciego', 215, 01, 6);
INSERT INTO Song VALUES (48, 'Yunta de oro', 213, 02, 6);
INSERT INTO Song VALUES (49, 'Quejumbroso', 215, 03, 6);
INSERT INTO Song VALUES (50, 'Mato y voy', 214, 04, 6);
INSERT INTO Song VALUES (51, 'Pata ancha', 203, 05, 6);
INSERT INTO Song VALUES (52, 'A Roberto Peppe', 187, 06, 6);
INSERT INTO Song VALUES (53, 'Marrón y azul', 200, 07, 6);
INSERT INTO Song VALUES (54, 'La rayuela', 200, 08, 6);
INSERT INTO Song VALUES (55, 'Seguime si podés', 190, 09, 6);
INSERT INTO Song VALUES (56, 'El embrollo', 190, 10, 6);
INSERT INTO Song VALUES (57, 'El refrán', 175, 11, 6);
INSERT INTO Song VALUES (58, 'Bien milonga', 195, 12, 6);
INSERT INTO Song VALUES (59, 'Pastoral', 170, 13, 6);
INSERT INTO Song VALUES (60, 'Canaro en París', 174, 14, 6);
INSERT INTO Song VALUES (61, 'Pinta brava', 165, 15, 6);
INSERT INTO Song VALUES (62, 'Punto y coma', 149, 16, 6);
INSERT INTO Song VALUES (63, 'Entrada prohibida', 170, 17, 6);
INSERT INTO Song VALUES (64, 'El buscapié', 170, 18, 6);
INSERT INTO Song VALUES (65, 'Jueves', 161, 19, 6);
INSERT INTO Song VALUES (66, 'Vayan saliendo', 151, 20, 6);
ALTER TABLE Song ALTER COLUMN id RESTART WITH 67;

-- playlists
INSERT INTO Playlist VALUES (1, 'Afternoon classics', '2015-02-01');
INSERT INTO Playlist VALUES (2, 'Evening energy', '2015-02-02');
INSERT INTO Playlist VALUES (3, 'Midnight mood', '2015-02-03');
ALTER TABLE Playlist ALTER COLUMN id RESTART WITH 4;

-- playlist songs
-- playlist #1 contents
INSERT INTO Playlist_Song VALUES (1, 1, 1, 6);
INSERT INTO Playlist_Song VALUES (2, 1, 2, 40);
INSERT INTO Playlist_Song VALUES (3, 1, 3, 18);
INSERT INTO Playlist_Song VALUES (4, 1, 4, 33);
INSERT INTO Playlist_Song VALUES (5, 1, 5, 21);
INSERT INTO Playlist_Song VALUES (6, 1, 6, 12);
INSERT INTO Playlist_Song VALUES (7, 1, 7, 39);
INSERT INTO Playlist_Song VALUES (8, 1, 8, 9);

-- playlist #2 contents
INSERT INTO Playlist_Song VALUES (9, 2, 1, 10);
INSERT INTO Playlist_Song VALUES (10, 2, 2, 21);
INSERT INTO Playlist_Song VALUES (11, 2, 3, 4);
INSERT INTO Playlist_Song VALUES (12, 2, 4, 18);
INSERT INTO Playlist_Song VALUES (13, 2, 5, 31);
INSERT INTO Playlist_Song VALUES (14, 2, 6, 33);
INSERT INTO Playlist_Song VALUES (15, 2, 7, 15);
INSERT INTO Playlist_Song VALUES (16, 2, 8, 9);
INSERT INTO Playlist_Song VALUES (17, 2, 9, 44);

-- playlist #3 contents
INSERT INTO Playlist_Song VALUES (18, 3, 1, 8);
INSERT INTO Playlist_Song VALUES (19, 3, 2, 5);
INSERT INTO Playlist_Song VALUES (20, 3, 3, 11);
INSERT INTO Playlist_Song VALUES (21, 3, 4, 17);
INSERT INTO Playlist_Song VALUES (22, 3, 5, 23);
INSERT INTO Playlist_Song VALUES (23, 3, 6, 3);
INSERT INTO Playlist_Song VALUES (24, 3, 7, 29);
INSERT INTO Playlist_Song VALUES (25, 3, 8, 38);
INSERT INTO Playlist_Song VALUES (26, 3, 9, 14);
INSERT INTO Playlist_Song VALUES (27, 3, 10, 7);
INSERT INTO Playlist_Song VALUES (28, 3, 11, 45);
INSERT INTO Playlist_Song VALUES (29, 3, 12, 32);
INSERT INTO Playlist_Song VALUES (30, 3, 13, 25);
INSERT INTO Playlist_Song VALUES (31, 3, 14, 41);
INSERT INTO Playlist_Song VALUES (32, 3, 15, 6);
--
ALTER TABLE Playlist_Song ALTER COLUMN id RESTART WITH 33;