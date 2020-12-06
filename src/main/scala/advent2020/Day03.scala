package advent2020

object Day03 {
  val inputs: String =
    """
....##..#........##...#.#..#.##
.#.#..#....##....#...#..##.....
##.#..##..#...#..........##.#..
.#.##.####..#......###.........
#.#.#...........#.....#...#....
#.......#....#.#.##..###..##..#
.#...#...##....#.........#.....
..........##.#.#.....#....#.#..
.......##..##...#.#.#...#......
.#.#.#...#...##...#.##.##..#...
........##.#.#.###.........##..
#.#..#.#.#.....#...#...#......#
.#.#.#...##......#...#.........
.#..##.##.#...#...##....#.#....
.##...#..#..#......##.###....##
.....#...#.###.....#.#.........
#.##..#....#.#.#.#.............
........#...#......#...#..#....
##..##...##.##...#...#.###...##
#.#....##.#...###......#..#.#..
..#.....#.##......#..........#.
#.......#..#......#.....#....#.
.....###...........#....#.##...
#.#........##.......#.#...#.##.
.#.#.#........#........#.#.....
#..#..##.....#.###..#.#.#.##..#
..#.#...#..##.#.#.#.......###..
........#........#..#..#...#...
##............#...#..##.##...#.
#....#.#.....##...#............
............#...#..#.#.#....#..
#.#.#...##.##.#....#....#......
................###.....#.....#
##.#####.#..#...###..#...###...
...#.....#...#.#....#...#..#...
.......#....##.##.#.##.........
..#..#..##.....#...#.#.....#...
...#...#.#.##.#..###.......#...
...#...........#.#####..##..#..
#.#...#........####..#......#.#
#..#.##...........#.#......#.##
#.#..#....##..#..##.#..........
.....#..#.....#........##..#...
...###.......#.##.......#......
...##..#..#...#....#.###...#...
....####....#........#.##.#.#.#
#....#.....#.###.##...##..##.##
.##.#...#.##.#......#..##.#....
...#.............#.............
..##..##.#.....#........##....#
#.....#....#.......####...#..#.
..#...#..#...#...##.#....##....
.#...##....#....#..#....#......
##..#.#...##......#..#.......##
..#...#.##..#.....#.#...#..#.#.
#..##....#..........#..........
.#........#..#......#......#.#.
...##.#.........#.#....#.#...#.
#.....#.#..#...#...#..#...#...#
#.........#.#.........##.......
.#.......#......#.........###..
.#..#..##...........#.....#..#.
.#....................#.....#..
.##.....#....#....#.###.....#..
...##.#.....#.#....#.........#.
.........##.....#.....#.##..#..
......#......#.#..#..###...#..#
..##...#.#..#...#.#....#.......
..#..##.###.#..#..#..#......#..
.....##...##.........#...##...#
###.#..##....##...##.#..###....
#...#.#..##......##...#.#..#...
..........#....###....#........
#.#.#.#.#.....#..##.##.....#...
.##.....#...#.....#......#.....
.#..........#.#.............#..
.#..##..#.#..##...#....#.##...#
..#.#..........#...#..........#
.#.......#.......#...#..#.....#
##.#...##...#......#.#..#......
#####..#....#..#...#...#.#.....
....#.......#.#..#.............
#..#..#.#.####...#....#....##..
#..#.##.#......#...#......#....
#...##.##...#....#..........##.
..#..#.......##.#....#...#.#...
.....#.##..............##.....#
..##.##...##.....#.........#.#.
.#....##...##...##..#....##..#.
.#...#....#..#......#.#........
#....#.#.#..............#....##
..##..#..#....#####.#....#.#.##
#....#...#.##..#.##.........###
#..#..#....#...............#.#.
#....##...##........##.##.#.##.
......#......##....##.....#.###
#...##..#..#.....#.#........##.
..#.#.##...#...#....#..###...#.
#..##..#.###..##.#.#....#......
..###..#.##........###.....#...
#.............#.............#..
.#.##....#..##.#...#....#.#####
###.....###.#......##..#..##...
.#.#......##.#....#....#.#..#..
###..#..#....#......###.##.....
......#.......#......#..##..##.
..#..#...#..#....#.##....#.#..#
.......##..#........#.#.##.....
.#...#..#........#..#.#..#..#.#
.#..#.##.......#......#...#.#..
.##..##......##.#...#......####
.....#....#......#.....#......#
..........#.#.#...##.#..#.#....
...#.......##......#..#.#.##...
.###..#.#.#....................
##...#...#.##............#.....
....#....#.##...#..#.#...##....
..#.#....#.###...#...#.#.####.#
..#..#.#...#.#......##.........
#..#..####.##.#.#..###....#...#
....#..........#.##.#..#.#.#.#.
#.#.##.........#.....##...#..##
#......#...#.##.#......#..#.#..
#...#........#..#..#...##...#..
.....#.####..##..#.#.##..#...#.
#..#........#........#...#....#
...........#..#.....#.#.#.#....
....#......#....#...#....##....
.#.#..#...#.#....#..#.#....##.#
....#...#...#.##..#...#..##...#
#######...............##.....##
.#.#..............#....#..#.###
#......#.#......###....###.....
##..#...#.##..##..##.#....#....
#....##..#..#...#.#.#...#......
..........#..#.##..##.##.#..##.
....#.#.#.....##........#..#...
..###...#.....##.##.....##..##.
....#.#..#.#.......#.......#...
..##.#..#.....##...###...#...#.
..#.........#...##...#...#..#..
..#..#..#..#..##.#...##..#.#...
...##..#..##..#..####...#.....#
............#............###...
.#.#.###.#.....#.#.#..#.###..#.
...#.........#.....####........
....##.#..##.#.............#...
....#.##.....#..#.....#......##
..........#.............#...##.
#..#.....#.......##..###.......
..##.#...........#.......#..#..
...#...#.#.##.###....#.#..#....
...#..........##..#..#..#...###
.........#.....#..##.....#..#..
#........#...#...#..#.#....##..
.#.#.....####..#.##.#..........
###.......##..#.##...#.....#...
..###.##.#..#..#..#.....##...#.
.........#.....##.#..#..##.....
#..#..##...###..............#..
#....#.#....#..#.....#..####...
####..#.....##...#..#.#.#.#...#
...#....#.....#.##.#.#.#....##.
..........#...#.....###....#.##
#....#.#.#....#..#..#.....#....
.....#.#...#......#....#......#
.####....##...#...#......##..#.
.#...#..#....#..#..............
##.#...##...#.##..#......#.....
..####.##..#....#.#......#.#.##
........#.....##...#.#..##....#
....#.#.#.#.###...#.#...##...##
#.....#...####.#....#.#........
..#.....#...##.........###.....
....#....#....#..#......#####.#
###.....#..#.#.#......#.##.#...
....#.##......#..#.#...........
.#....#....#.#..#.......#...##.
...................#.#.#..#....
##...#.....#........#....#...#.
........##......#...##.#..#.#.#
#.#..###...#....#.#...#.......#
#..........##......#..#..#.....
.............#...##.#...#......
#..#....##..#.........#..#.###.
.....#..........#....##.#...##.
###....................#.#.##..
#........##...##......#....###.
#....#.............#....#...#..
##.......##.#.......#....#..#..
##...#............#..#.#....##.
..#.#..#...#####..........#....
..#.........##.....#.#...####..
....#..............#...........
..#...#.#.#..#.......##.#.#.#..
....#.##.....##..#.....#..####.
#...#...#...#.......#.........#
......#..#.####...###.#.#.....#
.......#..#..#.....#.#..##.#..#
.#......##..#............#.....
.#........#.#....#....#........
.....#.#..#.##.#..##....#..#...
#.#...........#....##.....#....
..#..#..##.###..##..#..###.#.##
##.#..#...##.#.........#...#.#.
......#..#..##...#....#...#.##.
#.##.......................#...
.......#..#..#.##..##......#...
..#.#...#.....#..###....#...#..
##..#.....#..#..#.##.....#...##
#...##...###...#.#..###....#...
...#.#.#..####.....#...##....#.
.#.#..##.....#..#.....##..##..#
#...#..........#.##.#.#........
..##....#.##....#..##......#...
....#..........###.....####..##
...........###....##.#.#.#.#...
...#......................####.
#.#.#...#.#.#.#.#......#.....##
..###...#.####...#..##..#....#.
....#....#.......#...#.........
.#.###.............##..#...#...
....#.#....##...#.....#.##.....
#.......##.....#.#.....#....##.
....##.....###..#.#..#....#...#
......#..##...#......#.....#.##
.#.....#.##.###....#.....#..###
...#..#.###.#....#..#..#...##.#
...##..#...#..#.#.#..#...#.....
##.####...##..#.#.#....#.......
..##..#.#.......##.#......##.#.
....##....#....#..#....#..##.#.
..##..........##....#...#.#..#.
#.#...#.#.###.#.#..##.#...#....
.....#..#.............#...#...#
....#.#..#...##...#....#.##....
#..#...#.###.....#...#.....#.#.
#####....#....#....#.......#.##
#...##....##.#.#...#.....##.#..
#.......#...#..#..#...#....#...
....#......#.#..........#....##
#.###...#.#..##..#.##........#.
#..#.....##.......#..#..#.#....
...#...#.##...#....#.#.#.#...#.
...##..#.#....#......###......#
#.#....#...#..#..#....#........
..#..#.#...##..........#.###...
#..........#...#..#....#....###
..#..#.#....#..............#...
...#........#...#.#....###.#..#
....#.#.#................#..#.#
..#........##.#....#.#..#......
...##..#..#.......#..#......#.#
..#..#....#.........#....#.##..
#.....#....###.#..#..#...#...#.
..#..##.###.#..##....#.###.....
...#...####..#........###.#....
.........#.#...#..#..#.#.......
.##.........##.#..............#
..#.#.#.....###........#.#.#..#
....##..#....#....#.#..#.......
#.#.....#...#........##........
.##.#.#..#..#.#.#.........#....
#.....#..#.##...#...#..........
##..#....#....##.#..#.........#
................#.##.#......#.#
..#..#.#........##...###..#...#
##........#.......#...##.##..#.
##....#.....#..##....#.......#.
#.#....#.#........#..#.........
......##......#...#.....#.##...
###....#..........##.#.#......#
......#...###.........###..#...
.####....#...##..#.#.....#...#.
.##...#...###....#...#.#..###..
#..#......##...#.###..###...#..
#....#.#.#..#....##...#.##..#..
..#.....#...#..........#.##.###
#.....#....###.......##..##.#..
#..##...#..#....#.###......#...
#..#........##..#.....#.#.#....
#.##.#.#..#....#.#.............
.#...............#....##.......
.#.##......##........#...#..#.#
.#...#....#....#...#..#...##...
.....#..###...##........#.#....
...#.......#....##..#..#....#..
...###....#........#..#.###.#..
......##..##..............###.#
.......#.####..##....#.#....#..
#...#......#...#..#.....##....#
.#..#..###....#..##.##.#.......
#......##......#..##....#..##..
.....#..#.#......##.##..##.....
...#..#.......#......#.........
....#..####......#..#....#...#.
..#.#..#...#....#....#.......#.
####..#........#.###...##.#.#.#
.......##........#.#.#...##....
...#.........#..#.#..##....#...
.....#..#...#.#....#...#.#.##.#
#..##.....#.....##.......#...#.
.......##.#.#.....#....#......#
...#...#.##...#......#....#....
..#..#.#...#..#.....#...###.#..
.........#...#..#.......##.....
..##...................#..#.###
.##.##..#.#...#.#....#.....##..
#.#...##...#...#...##..#......#
....#..#...#.....##.#.....#..##
##.#..........###..#...#..#....
...##....#.##....#......#......
.....#.........#....#.#.......#
.......#............#.#.....#..
..#..#...#..#####..#....##.....
...##......##...#.#........##..
.....#..###...##.#.#.##.#...#..
..#.#.#..##..#.##...##.#.#.....
......##...#..##......#.#......
......................#........
#...#..#....#..#.#.##.#.....#.#
.#......#.#....#.#.#..#....#...
.#..#.#.#..#....#..............
"""

  def ready(inputs: String): Array[Array[Char]] = {
    inputs.linesIterator
      .map(_.trim)
      .filter(_.nonEmpty)
      .map(_.toCharArray)
      .toArray
  }

  def solve1(dx: Int, dy: Int)(implicit slope: Array[Array[Char]]): Int = {
    solve11(0, 0)(dx, dy)
  }

  def solve11(x: Int, y: Int)(dx: Int, dy: Int)(implicit slope: Array[Array[Char]]): Int = {
    if (y >= slope.length) return 0
    val xx = x % slope(y).length
    (if (slope(y)(xx) == '#') 1 else 0) + solve11(xx + dx, y + dy)(dx, dy)
  }

  def solve2(implicit slope: Array[Array[Char]]): Long = {
    val steps: Array[(Int, Int)] = Array(
      (1, 1), (3, 1), (5, 1), (7, 1), (1, 2)
    )
    steps.map(st => solve1(st._1, st._2).toLong).product
  }

  def test2(): Unit = {
    val testInputs =
      """
    ..##.......
    #...#...#..
    .#....#..#.
    ..#.#...#.#
    .#...##..#.
    ..#.##.....
    .#.#.#....#
    .#........#
    #.##...#...
    #...##....#
    .#..#...#.#
    """
    val slope = ready(testInputs)
    println(s"Test2: ${solve2(slope)}")
  }

  def main(args: Array[String]): Unit = {
    val slope = ready(inputs)
    println(s"Inputs: ${slope.length} lines")
    println(s"Answer1: ${solve1(3, 1)(slope)}")
    println(s"Answer2: ${solve2(slope)}")
    test2()
  }
}
