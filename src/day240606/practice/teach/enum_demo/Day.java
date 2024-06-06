package day240606.practice.teach.enum_demo;

public enum Day implements ForEnumDemo {
    MONDAY {
        @Override
        public void desc() {
            System.out.println("一脸懵");
        }
    },
    TUESDAY {
        @Override
        public void desc() {
            System.out.println("前不着村，后不着店");
        }
    },
    WEDNESDAY {
        @Override
        public void desc() {
            System.out.println("Midweek days are so-so.");
        }
    },
    THURSDAY {
        @Override
        public void desc() {
            System.out.println("加把劲");
        }
    },
    FRIDAY {
        @Override
        public void desc() {
            System.out.println("心已放假");
        }
    },
    SATURDAY {
        @Override
        public void desc() {
            System.out.println("爽啊");
        }
    },
    SUNDAY {
        @Override
        public void desc() {
            System.out.println("握草，这就...");
        }
    };
}
