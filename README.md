# Что нужно было сделать
Задание по [09 модулю "Потоковый ввод-вывод. Чтение-запись в файлы"](https://lms.skillfactory.ru/courses/course-v1:SkillFactory+ANDROID-NEW+2020/courseware/0723967be3c447548007d7d281816153/55363fca74c64c6bace64736ee3020f1/7?activate_block_id=block-v1%3ASkillFactory%2BANDROID-NEW%2B2020%2Btype%40vertical%2Bblock%401d884fe695a94b52a4e906aace984cd9)
# Что сделано
## Задача
Разработать класс "Поток знаков числа Пи", выдающий по методу read() очередной его знак
## Предлагаемое решение
Разработан классы [PiNumberStream](src/PiNumberStream.java) и "тестовый" класс [Main](src/Main.java)
В PiNumberStream реализован вывод последовательно знаков числа Пи. 
В случае достижения предельной точности перехватывается исключение StringIndexOutOfBoundsException и преобразуется в IOException, обязательное для потока этого вида.
Можно в Main выбирать разную точность, задавая те или иные максимальные значения для переменной i