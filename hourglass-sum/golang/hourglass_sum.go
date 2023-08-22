package golang

func hourglassSum(arr [][]int32) int32 {
	var row, col, skip, sum int32
	var maxSum int32 = -63
	for row < 4 {
		for col < 4 {
			for i := row; i < row+3; i++ {
				for j := col; j < col+3; j++ {
					skip++
					if skip == 4 || skip == 6 {
						continue
					}
					sum += arr[i][j]
				}
			}

			if sum > maxSum {
				maxSum = sum
			}
			sum = 0
			skip = 0
			col++
		}
		col = 0
		row++
	}

	return maxSum
}
