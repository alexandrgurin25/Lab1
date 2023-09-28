package ru.mirea.lab4;


// 1) Создаем перечисление с временами года и средними температурами
    enum Season {
        ВЕСНА(15),
        ЛЕТО(25),
        ОСЕНЬ(10),
        ЗИМА(0);

        private int averageTemperature;

        // 4) Добавляем конструктор
        Season(int averageTemperature) {
            this.averageTemperature = averageTemperature;
        }

        // 5) Переопределяем метод getDescription
        public String getDescription() {
            // Для Лета возвращаем "Теплое время года", для остальных "Холодное время года"
            if (this == ЛЕТО) {
                return "Теплое время года";
            } else {
                return "Холодное время года";
            }
        }

        // 3) Добавляем метод для получения средней температуры
        public int getAverageTemperature() {
            return averageTemperature;
        }

        // 2) Создаем метод, использующий оператор switch
        public static void printSeasonDescription(Season season) {
            switch (season) {
                case ВЕСНА:
                    System.out.println("Я люблю весну");
                    break;
                case ЛЕТО:
                    System.out.println("Я люблю лето");
                    break;
                case ОСЕНЬ:
                    System.out.println("Я люблю осень");
                    break;
                case ЗИМА:
                    System.out.println("Я люблю зиму");
                    break;
            }
        }
    }

