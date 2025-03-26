package stream.stream_objects;

import stream.Objects.Student;

import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class StreamStudent {
    public static void main(String[] args) {
        List<Student> list = List.of(
                new Student("Brian", 23, "M", 9.5, "Morning", true, false, "first"),
                new Student("George", 22, "M", 8.0, "Afternoon", true, false, "second"),
                new Student("Charly", 21, "M", 7.5, "Morning", false, true, "first"),
                new Student("Jenny", 20, "F", 6.5, "Afternoon", true, false, "second"),
                new Student("Andy", 19, "M", 5.5, "Afternoon", false, true, "first"),
                new Student("Anderson", 22, "M", 9.5, "Afternoon", false, false, "third"),
                new Student("Peter", 25, "M", 9.5, "Morning", true, true, "first"),
                new Student("Emma", 23, "F", 9.5, "Morning", true, false, "third"),
                new Student("Charlotte", 22, "F", 8.0, "Afternoon", true, false, "second"),
                new Student("Charlotte", 21, "F", 7.5, "Morning", false, true, "first"),
                new Student("Sophia", 20, "F", 6.5, "Afternoon", true, false, "third"),
                new Student("Isabella", 19, "F", 5.5, "Afternoon", false, true, "third"),
                new Student("Isabella", 22, "F", 9.5, "Afternoon", false, false, "third"),
                new Student("Harper", 23, "F", 9.5, "Morning", true, true, "first"),
                new Student("James", 23, "M", 9.5, "Morning", true, false, "second"),
                new Student("John", 22, "M", 8.0, "Afternoon", true, false, "second"),
                new Student("Robert", 21, "M", 7.5, "Morning", false, true, "third"),
                new Student("Michael", 20, "M", 6.5, "Afternoon", true, false, "first"),
                new Student("William", 19, "M", 5.5, "Afternoon", false, true, "second"),
                new Student("David", 22, "M", 9.5, "Afternoon", false, false, "first"),
                new Student("Richard", 23, "M", 5.5, "Morning", true, true, "second")
        );

//      Estudiante masculino de mayor edad.
        System.out.println("==========Estudiante masculino de mayor edad.==========");
        list.stream().filter(x -> x.getSex().equals("M")).max(Comparator.comparingInt(Student::getAge))
                .ifPresent(System.out::println);
//      Estudiante femenino de menor edad.
        System.out.println("==========Estudiante femenino de menor edad.==========");
        list.stream().filter(x-> x.getSex().equals("F")).min(Comparator.comparingInt(Student::getAge))
                .ifPresent(System.out::println);
//      Estudiantes de segundo semestre.
        System.out.println("==========Estudiantes de segundo semestre.==========");
        list.stream().filter( x-> x.getSemestre().equals("second")).forEach(System.out::println);

//      Estudiantes del turno matutino.
        System.out.println("==========Estudiantes del turno matutino.==========");
        list.stream().filter(x-> x.getShift().equals("Morning")).forEach(System.out::println);

        System.out.println("==========Total de estudiantes masculinos==========");
        long m = list.stream().filter(x-> x.getSex().equals("M")).count();
        System.out.println(m);

        System.out.println("==========Imprimir los semestres de los estudiantes.==========");
        list.stream().map( Student::getSemestre).distinct().forEach(System.out::println);

        System.out.println("==========Estudiantes mayores de 22 años.==========");
        list.stream().filter(x-> x.getAge() > 22).forEach(System.out::println);

        System.out.println("==========Estudiantes con promedio mayor a 6.0==========");
        list.stream().filter(s -> s.getAvg() >6.0).forEach(System.out::println);

        System.out.println("Mostrar a los estudiantes extranjeros.");
        list.stream().filter(Student::isForeign).forEach(System.out::println);

        System.out.println("Agrupar estudiantes por promedio, para todos los promedios menores a 6.0");
        Map<Double, List<Student>> map = list.stream().filter(s-> s.getAvg() < 6.0)
                .collect(Collectors.groupingBy(Student::getAvg));
        System.out.println(map);

        System.out.println("Mostrar 3 estudiantes con el mejor promedio.");
        list.stream().sorted((s1,s2) -> (int) (s2.getAvg() - s1.getAvg())).limit(3)
                .forEach(System.out::println);

        System.out.println("Mostrar nombre de estudiantes en orden alfabético");
        list.stream().map(Student::getName).sorted().forEach(System.out::println);

        System.out.println("Ordenar estudiantes por edad. (menor a mayor).");
        list.stream().sorted((x,y) -> y.getAge() -x.getAge()).forEach(System.out::println);

        System.out.println("Ordenar nombre de estudiantes alfabéticamente (Z-A).");
        list.stream().map(Student::getName).sorted(Comparator.reverseOrder()).forEach(System.out::println);

        System.out.println("Imprimir los promedios usando como separador (,).");
        String str = list.stream().map(s-> String.valueOf(s.getAvg()))
                .collect(Collectors.joining(","));
        System.out.println("str = " + str);

        System.out.println("Dividir los estudiantes extranjeros de los estudiantes no extranjeros.");
        Map<Boolean, List<Student>> mapForeing = list.stream().collect(Collectors.groupingBy(Student::isForeign));
        System.out.println(mapForeing);

        System.out.println("Mostrar cualquier estudiante de tercer semestre.");
        list.stream().filter(s-> s.getSemestre().equals("third")).findAny().ifPresent(System.out::println);

        System.out.println("Imprimir el nombre de algún estudiante de primer semestre.");
        list.stream().filter(s-> s.getSemestre().equals("first")).map(Student::getName).findFirst()
                .ifPresent(System.out::println);

        System.out.println("Imprimir los nombres de los estudiantes que inicien con la letra A.");
        list.stream().map(Student::getName).filter(name -> name.startsWith("A")).forEach(System.out::println);

        System.out.println("Imprimir los nombres de estudiantes en mayúsculas.");
        list.stream().map(s-> s.getName().toUpperCase()).forEach(System.out::println);

        System.out.println("Mostrar los promedios diferentes.");
        list.stream().map(Student::getAvg).distinct().forEach(System.out::println);

        System.out.println("Mostrar los promedios de los estudiantes femeninos del turno vespertino.");
        list.stream().filter(s->s.getSex().equals("F")).filter(s->s.getShift().equals("Afternoon"))
                .map(Student::getAvg).forEach(System.out::println);

        System.out.println("Mostrar los nombres de los estudiantes masculinos de primer semestre " +
                "con promedio mayor a 7.0.");
        list.stream().filter(s->s.getSex().equals("M")).filter(s->s.getSemestre().equals("first"))
                .filter(s->s.getAvg() > 7.0).map(Student::getName).forEach(System.out::println);


        System.out.println("Contar los estudiantes extranjeros del turno matutino de segundo " +
                "y tercer semestre con promedio mayor a 7.0.");

        long c = list.stream().filter(Student::isForeign)
                .filter(student -> student.getShift().equals("Morning"))
                .filter(student -> student.getSemestre().equals("second") || student.getSemestre()
                        .equals("third")).filter(student -> student.getAvg() >7.0).count();

        System.out.println(c);

        System.out.println("Listar los nombre en orden alfabético de los estudiantes extranjeros con promedio " +
                "mayor a 8.0 del turno matutino.");

        list.stream()
                .filter(Student::isForeign)
                .sorted(Comparator.comparing(Student::getName))
                .filter(s-> s.getAvg() > 8.0)
                .filter(s-> s.getShift().equals("Morning"))
                .map(Student::getName)
                .forEach(System.out::println);


        System.out.println("Obtener los 2 mejores promedios de estudiantes femeninas no extranjeras de segundo " +
                "semestre del turno vespertino.");

        list.stream()
                .filter(s-> s.getSex().equals("F"))
                .filter(student -> student.getSemestre().equals("second"))
                .filter(student -> !student.isForeign())
                .filter(student -> student.getShift().equals("Afternoon"))
                .map(student -> (int)student.getAvg())
                .sorted((x,y) -> y-x).limit(2).forEach(System.out::println);

        System.out.println("Calcular el promedio de los 3 mejores promedio de alumnos masculinos mayores de 20 años " +
                "extranjeros pertenecientes al turno matutino. ");

        list.stream()
                .filter(student -> student.getSex().equals("M"))
                .filter(student -> student.getAge() > 20)
                .filter(Student::isForeign)
                .filter(student -> student.getShift().equals("Morning"))
                .map(student -> (int)student.getAvg())
                .sorted( (x,y) -> y -x)
                .limit(3)
                .mapToInt(x -> x).average().ifPresent(System.out::println);

        System.out.println("Mostrar los estudiantes becados del turno vespertino de segundo semestre.");
        list.stream()
                .filter(Student::isScholarship)
                .filter(student -> student.getShift().equals("Afternoon"))
                .filter(student -> student.getSemestre().equals("second")).forEach(System.out::println);

        System.out.println("Mostrar los nombres de los estudiantes masculinos extranjeros del turno matutino y " +
                "de segundo semestre con promedio impar.");

        list.stream().
                filter(student -> student.getSex().equals("M"))
                .filter(Student::isForeign)
                .filter(student -> student.getShift().equals("Morning"))
                .filter(student -> student.getSemestre().equals("second"))
                .filter(student -> student.getAvg() %2 != 0)
                .map(Student::getName).forEach(System.out::println);

        System.out.println("Mostrar los estudiantes de nombre Isabella mayores a 18 años.");

        list.stream()
                .filter(student -> student.getName().equals("Isabella"))
                .filter(student -> student.getAge() >18).forEach(System.out::println);
}
}
