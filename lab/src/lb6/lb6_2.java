package laba6;

public class lb6_2
{
    public long diplom (long n , long w , long h)
    {
        long left = 1;
        long right = Math.max(w, h) * n;

        while (left < right)
        {
            long mid = left + (right - left) / 2;

            long col = mid / w;
            long str = mid / h;
            if (col * str >= n)
                right = mid;
            else
                left = mid + 1;

        }
        return left;
    }
}
