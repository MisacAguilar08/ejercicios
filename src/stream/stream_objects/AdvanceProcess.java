package stream.stream_objects;

import stream.Objects.Student;

import java.util.DoubleSummaryStatistics;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;

public class AdvanceProcess {
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


        System.out.println("Listar el número de veces que un nombre se repite.");
        Map<String, Long> mapNameCount = list.stream()
                .collect(Collectors.groupingBy(Student::getName, Collectors.counting()));
        System.out.println(mapNameCount);

        System.out.println("Agrupar estudiantes por semestre.");
        Map<String, Set<String>> mapNameSemestre = list.stream()
                .collect(Collectors.groupingBy(Student::getSemestre, Collectors.mapping(Student::getName, Collectors.toSet())));
        System.out.println(mapNameSemestre);

        System.out.println("Agrupar estudiantes por sexo.");
        Map<String, Set<String>> mapSex = list.stream()
                .collect(Collectors.groupingBy(Student::getSex, Collectors.mapping(Student::getName, Collectors.toSet())));
        System.out.println(mapSex);

        System.out.println("Obtener el mayor promedio.");
        DoubleSummaryStatistics avg = list.stream().collect(Collectors.summarizingDouble(Student::getAvg));
        System.out.println(avg.getMax());

        System.out.println("Obtener el promedio de todos los promedios de los estudiantes.");
        DoubleSummaryStatistics avgStudent  = list.stream().collect(Collectors.summarizingDouble(Student::getAvg));
        System.out.println(avgStudent.getAverage());

        System.out.println("Obtener el promedio por semestre.");
        Map<String, DoubleSummaryStatistics> mapAvgSemestre = list.stream()
                .collect(Collectors.groupingBy(Student::getSemestre,Collectors.summarizingDouble(Student::getAvg)));
        System.out.println(mapAvgSemestre);
    }
}
