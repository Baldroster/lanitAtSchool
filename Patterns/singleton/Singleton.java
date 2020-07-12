package singleton;

public class Singleton {

        private static Singleton instance;


        //Статик блок вызывается при первом обращении к классу
        //Производим инициализацию статического экземпляра при первом обращении к классу
        static {
            instance = new Singleton();

        }


        //конструтор вызывается лишь при первом обращении к классу и недоступен для вызова из вне.
        private Singleton () {}


        //При последующих обращениях к классу мы возвращаем уже инициализированный экземпляр
        public static Singleton getInstance() {
            return instance;
        }
    }

