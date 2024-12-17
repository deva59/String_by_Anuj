package Comparable_And_Comparator;



    public class Animal implements Comparable<Animal> {
    int age;
    String name;
    int weight;

        public int getAge() {
            return age;
        }

        public void setAge(int age) {
            this.age = age;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public int getWeight() {
            return weight;
        }

        public void setWeight(int weight) {
            this.weight = weight;
        }

        public Animal(int age, String name, int weight) {
        this.age = age;
        this.name = name;
        this.weight = weight;
    }

    @Override
    public String toString() {
        return "Animal{" +
                "age=" + age +
                ", name='" + name + '\'' +
                ", weight=" + weight +
                '}' + "\n";
    }

    //compared age after sorting..
//        @Override
//        public int compareTo(Animal that) {
//            return this.age-that.age;
//        }
//    }

        //is method ke under agar age same hai to compare kardo name se or sort kardo.
        @Override
    public int compareTo(Animal that){
        //Compare with name base..
            if(this.age == that.age){
                //.comparedTo method implement in String.
                return this.name.compareTo(that.name);
            }
        return this.age- that.age;
    }
    }

   //42
