function sortArrayDescending(array) {
  const comparator = (a, b) => b - a;
  array.sort(comparator);

  return array;
}

const array = [5, 2, 7, 3, 1, 4];
const sortedArray = sortArrayDescending(array);

console.log(sortedArray); 
