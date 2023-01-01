let url="https://example.com?foo=1&bar=2";

import searchParams from "./url.js";

test("Test Your Url",()=>{
    expect(searchParams(url,"bar")).toBe("2");
});