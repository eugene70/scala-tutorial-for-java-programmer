package advent2020

import java.util.stream.IntStream

object Day01 {
  val nums: Array[Int] = Array(
    1735,
    1700,
    1358,
    1908,
    1634,
    2006,
    762,
    1492,
    1917,
    1591,
    1571,
    1283,
    1744,
    1815,
    1383,
    1787,
    1832,
    1032,
    1845,
    1406,
    1978,
    1263,
    1450,
    1364,
    1594,
    1877,
    1346,
    1695,
    1501,
    1266,
    1729,
    1476,
    1558,
    1684,
    1295,
    1267,
    1341,
    1415,
    1491,
    1640,
    1756,
    1330,
    1987,
    1969,
    1844,
    1706,
    1654,
    1580,
    1405,
    1419,
    1367,
    1277,
    1992,
    1953,
    1499,
    1470,
    2000,
    1739,
    1889,
    1670,
    1776,
    1798,
    1308,
    1890,
    1626,
    1284,
    1315,
    1869,
    1514,
    1214,
    1648,
    1418,
    1329,
    1795,
    1385,
    1477,
    1984,
    1796,
    1515,
    2001,
    1155,
    1800,
    1965,
    1971,
    1100,
    1650,
    1686,
    1911,
    1560,
    1912,
    1721,
    1658,
    1738,
    1885,
    1028,
    266,
    1989,
    1704,
    1388,
    1498,
    1769,
    1453,
    925,
    1588,
    1828,
    1024,
    1671,
    1998,
    1942,
    1636,
    1382,
    993,
    1703,
    1475,
    1391,
    1970,
    1841,
    1952,
    1446,
    1347,
    1395,
    1440,
    1980,
    1386,
    1922,
    1857,
    1291,
    1808,
    1335,
    1876,
    1576,
    1436,
    634,
    1557,
    1782,
    1881,
    1955,
    1765,
    1736,
    1585,
    1858,
    1862,
    989,
    1661,
    1757,
    1775,
    1693,
    1842,
    1660,
    1647,
    870,
    1928,
    1597,
    1420,
    1646,
    1821,
    2009,
    1866,
    1947,
    1593,
    1788,
    1369,
    1525,
    1256,
    1846,
    1445,
    1907,
    1750,
    1906,
    1849,
    765,
    1342,
    1811,
    1260,
    1466,
    1424,
    1823,
    1767,
    1290,
    1840,
    1825,
    1287,
    1384,
    1996,
    1627,
    1983,
    1328,
    1674,
    1676,
    1727,
    1810,
    1394,
    799,
    1723,
    1293,
    1273,
    1317,
    1749,
    1552,
    1645
  )

  def main(args: Array[String]): Unit = {
    time("solve1_1", () => solve1_1())
    time("solve1_2", () => solve1_2())
    time("solve2", () => solve2())
    time("solution(2)", () => solution(2))
    time("solution(3)", () => solution(3))
    time("solution2(2)", () => solution2(2))
    time("solution2(3)", () => solution2(3))
  }

  def solve1_1(): Int = {
    IntStream.range(0, nums.length - 1)
      .map(a =>
        IntStream.range(a + 1, nums.length)
          .filter(nums(a) + nums(_) == 2020)
          .map(nums(a) * nums(_))
          .findFirst()
          .orElse(0)
      )
      .filter(_ != 0)
      .findFirst()
      .orElse(0)
  }

  def solution(n: Int): Long = {
    nums.combinations(n).find(_.sum == 2020).get.product
  }

  def solution2(n: Int): Long = {
    val init = nums.combinations(n - 1).find(c => nums.contains(2020 - c.sum)).get
    init.product * (2020 - init.sum)
  }

  def solve1_2(): Int = {
    for (i <- 0 to nums.length - 2) {
      for (j <- i + 1 until nums.length) {
        if (nums(i) + nums(j) == 2020) {
          return nums(i) * nums(j)
        }
      }
    }
    0
  }

  def solve2(): Long = {
    for (i <- 0 to nums.length - 3) {
      for (j <- i + 1 to nums.length - 2) {
        for (k <- j + 1 to nums.length - 1) {
          if (nums(i) + nums(j) + nums(k) == 2020) {
            return nums(i) * nums(j) * nums(k)
          }
        }
      }
    }
    0
  }
}
